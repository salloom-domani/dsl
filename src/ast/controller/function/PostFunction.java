package ast.controller.function;

import ast.page.Page;

public class PostFunction extends Function {

    public Page page;
    
    public PostFunction(Page page) {
        id = "post";
        this.page = page;
    }

    public String getUrl() {
        return page.id;
    }
}
