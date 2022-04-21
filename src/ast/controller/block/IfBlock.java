package ast.controller.block;

import java.util.ArrayList;

/**
 * IfBlock
 */
public class IfBlock extends Block {

    public Condition condition;
    public ArrayList<Block> blocks;

    public IfBlock(Condition condition) {
        this.condition = condition;
        this.blocks = new ArrayList<>();
    }

    public void addBlocks(ArrayList<Block> blocks) {
        this.blocks.addAll(blocks);
    }

    @Override
    public String toString() {
        return "if " + condition + " then do " + blocks.get(0);
    }
}