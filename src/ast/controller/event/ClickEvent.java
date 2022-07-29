package ast.controller.event;

import ast.page.component.Component;

public class ClickEvent extends Event {

    public ClickEvent(Component component) {
        super("click", component);
    }
    
}
