package ast.page.component;

/**
 * Output
 */
public class Output extends Component {

    public Output(String id) {
        super(id);
    }

    @Override
    public String toString() {
        return id;
    }
    
}