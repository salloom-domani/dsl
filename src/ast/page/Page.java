package ast.page;

import java.util.ArrayList;
import java.util.List;

import ast.controller.Controller;
import ast.page.component.Component;

/**
 * Page
 */
public class Page extends Component {

    public Page parent;
    public Controller controller;
    public ArrayList<Component> components;

    public Page(String id) {
        super(id);
        components = new ArrayList<>();
    }

    public Page parent(Page parent) {
        this.parent = parent;
        return this;
    }

    public void addComponents(List<Component> components) {
        this.components.addAll(components);
    }

    public Component getComponentById(String Id) {
        return components
                .stream()
                .filter(component -> component.id.equals(Id))
                .findFirst()
                .orElse(null);
    }

}