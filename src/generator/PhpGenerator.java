package generator;

import ast.controller.function.Function;
import ast.controller.function.GotoFunction;
import ast.controller.function.PostFunction;
import ast.controller.function.ValidFunction;

public class PhpGenerator implements Generator{

    @Override
    public String generate() {
        return "<?php echo('Hello World!') ?>";
    }

    @Override
    public String generate(Function function) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String generate(GotoFunction gotoFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String generate(PostFunction postFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String generate(ValidFunction validFunction) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
