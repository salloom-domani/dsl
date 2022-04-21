package ast.controller.event;

import java.util.ArrayList;

import ast.controller.block.Block;

public class Event {
    
    public String id;
    public ArrayList<Block> blocks;

    public Event(String id) {
        this.id = id;
        this.blocks = new ArrayList<>();
    }

    public void addBlocks(ArrayList<Block> blocks) {
        this.blocks.addAll(blocks);
    }
}
