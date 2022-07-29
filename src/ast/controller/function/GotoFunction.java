package ast.controller.function;

import ast.page.Page;

public class GotoFunction extends Function {

    public Page page;
    
    public GotoFunction(Page page) {
        id = "goto";
        this.page = page;
    }

    public String getUrl() {
        return page.id;
    }
}
