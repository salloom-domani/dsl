package visitor;

import base.TEMParser.PageBodyContext;
import base.TEMParser.BlockContext;
import base.TEMParser.ComponentContext;
import base.TEMParser.ControllerBodyContext;
// import base.TEMParser.ControllerBodyContext;
import base.TEMParser.ControllerContext;
import base.TEMParser.EventContext;
import base.TEMParser.ExpressionContext;
import base.TEMParser.IfBlockContext;
import base.TEMParser.InContext;
import base.TEMParser.OutContext;
import base.TEMParser.PageContext;
import base.TEMParser.StatementContext;
import base.TEMParserBaseVisitor;

import java.util.ArrayList;
import java.util.HashMap;

import ast.controller.Controller;
import ast.controller.block.Block;
import ast.controller.block.Condition;
import ast.controller.block.Expression;
import ast.controller.block.IfBlock;
import ast.controller.block.Statement;
import ast.controller.event.Event;
import ast.page.Page;
import ast.page.component.Component;
import ast.page.component.Input;
import ast.page.component.Output;

public class TEMVisitor extends TEMParserBaseVisitor<Object> {

    public HashMap<String, Page> pages;
    public HashMap<String, Controller> controllers;

    public TEMVisitor() {
        pages = new HashMap<>();
        controllers = new HashMap<>();
    }

    
    @Override
    public Page visitPage(PageContext ctx) {
        String id = ctx.pageId.getText();
        Page page = new Page(id);
        
        ArrayList<Component> components = visitPageBody(ctx.pageBody());
        page.addComponents(components);
        
        this.pages.put(id, page);
        return page;
    }
    
    @Override
    public Controller visitController(ControllerContext ctx) {
        String controllerId = ctx.controllerId.getText();
        String pageId = ctx.pageId.getText();
        Page page = pages.get(pageId);
        Controller controller = new Controller(controllerId, page);

        ArrayList<Event> events = visitControllerBody(ctx.controllerBody());
        controller.addEvents(events);
        
        this.controllers.put(controllerId, controller);
        return controller;
    }
    
    @Override
    public ArrayList<Component> visitPageBody(PageBodyContext ctx) {
        ArrayList<Component> components = new ArrayList<>();
        
        for (var componentCtx : ctx.component()) {
            Component component = visitComponent(componentCtx);
            components.add(component);
        }
        
        return components;
    }

    @Override
    public ArrayList<Event> visitControllerBody(ControllerBodyContext ctx) {
        ArrayList<Event> events = new ArrayList<>();
        
        for (var eventCtx : ctx.event()) {
            Event event = visitEvent(eventCtx);
            events.add(event);
        }

        return events;
    }

    @Override
    public Component visitComponent(ComponentContext ctx) {
        return visitIn(ctx.in());
    }

    @Override
    public Input visitIn(InContext ctx) {
        return new Input(ctx.fieldId.getText());
    }

    @Override
    public Output visitOut(OutContext ctx) {
        return new Output(ctx.fieldId.getText());
    }

    @Override
    public Event visitEvent(EventContext ctx) {
        String id = ctx.ID().getText();
        Block block = visitBlock(ctx.block(0)); 
        ArrayList<Block> blocks = new ArrayList<>();
        blocks.add(block);
        Event event = new Event(id);
        event.addBlocks(blocks);
        return event;
    }


    @Override
    public Block visitBlock(BlockContext ctx) {
        try {
            return visitIfBlock(ctx.ifBlock());
        } catch (Exception e) {}
        try {
            return visitStatement(ctx.statement());
        } catch (Exception e) {}
        return new Block() {
            @Override
            public String toString() {
                return "Empty Block";
            }
        };
    }


    @Override
    public Statement visitStatement(StatementContext ctx) {
        return new Statement(ctx.getText());
    }

    @Override
    public IfBlock visitIfBlock(IfBlockContext ctx) {
        Expression expression = visitExpression(ctx.expression());
        Condition condition = new Condition(expression);
        IfBlock block = new IfBlock(condition);
        Block childBlock = visitBlock(ctx.block());
        ArrayList<Block> blocks = new ArrayList<>();
        blocks.add(childBlock);
        block.addBlocks(blocks);
        return block;
    }


    @Override
    public Expression visitExpression(ExpressionContext ctx) {
        return new Expression();
    }

    
}
