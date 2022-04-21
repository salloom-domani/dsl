package ast.controller.block;

/**
 * Condition
 */
public class Condition {

    public Expression expression;
    private String expresString;

    public Condition(Expression expression) {
        this.expression = expression;
    }

    public boolean eval() {
        return this.expression.value != 0;
    }

    @Override
    public String toString() {
        return this.expresString;
    }
}