import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import base.TEMLexer;
import base.TEMParser;
import visitor.TEMVisitor;

public class App {

    public static void main(String[] args) throws Exception {


        String file = "samples/test1.tem";
        CharStream sample = CharStreams.fromFileName(file);
        TEMLexer lexer = new TEMLexer(sample);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        TEMParser parser = new TEMParser(cts);
        ParseTree pt = parser.program();
        TEMVisitor visitor = new TEMVisitor();
        visitor.visit(pt);
        System.out.println(visitor.controllers.get("c1").events.get("submit").blocks);
    }
}
