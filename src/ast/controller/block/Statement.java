package ast.controller.block;

/**
 * Statement
 */
public class Statement extends Block {

    public String statement;

    public Statement(String statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return this.statement;
    }
}