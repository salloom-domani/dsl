package ast.page.component;

/**
 * Input
 */
public class Input extends Component {

    public Input(String id) {
        super(id);
    }

    @Override
    public String toString() {
        return id;
    }
}