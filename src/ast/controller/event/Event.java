package ast.controller.event;

import java.util.ArrayList;

import ast.controller.block.Block;
import ast.page.component.Component;

public class Event {
    
    public String id;
    public Component component;
    public ArrayList<Block> blocks;

    public Event(String id, Component component) {
        this.id = id;
        this.component = component;
        this.blocks = new ArrayList<>();
    }

    public void addBlocks(ArrayList<Block> blocks) {
        this.blocks.addAll(blocks);
    }
}
