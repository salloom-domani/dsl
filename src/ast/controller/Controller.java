package ast.controller;

import java.util.ArrayList;
import java.util.HashMap;

import ast.controller.event.Event;
import ast.page.Component;
import ast.page.Page;

/**
 * Controller
 */
public class Controller {
    
    public String id;
    public Page page;

    public HashMap<String, Integer> components;
    public HashMap<String, Event> events;

    public Controller(String id, Page page) {
        this.id = id;
        this.page = page;
        page.controller = this;
        setupComponents();
    }

    public void setupComponents() {
        this.components = new HashMap<>();
        for (int i = 0; i < this.page.components.size(); i++) {
            this.components.put(this.page.components.get(i).id, i);
        }
    }

    public void addEvents(ArrayList<Event> events) {
        this.events = new HashMap<>();
        for (int i = 0; i < events.size(); i++) {
            this.events.put(events.get(i).id, events.get(i));
        }
    }

    public Component getComponent(String id) {
        int index = this.components.get(id);
        return this.page.components.get(index);
    }

    @Override
    public String toString() {
        return this.id;
    }
}
