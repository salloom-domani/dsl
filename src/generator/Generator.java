package generator;

import ast.controller.function.*;

public interface Generator {
    public abstract String generate();
    public abstract String generate(Function function);
    public abstract String generate(GotoFunction gotoFunction);
    public abstract String generate(PostFunction postFunction);
    public abstract String generate(ValidFunction validFunction);
}
