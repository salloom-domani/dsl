package generator;

import static j2html.TagCreator.*;

import ast.controller.function.*;

public class HtmlGenerator implements Generator {
    public String generate() {
        return html(
                head(title("Salem Domani")),
                body(
                        h1("Hello, World!"),
                        img().withSrc("/img/hello.png")))
                .renderFormatted();
    }

    @Override
    public String generate(Function function) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String generate(GotoFunction gotoFunction) {
        return String.format("<script>window.location = '%s'</script>", gotoFunction.getUrl());
    }

    @Override
    public String generate(PostFunction postFunction) {
        return String.format("<script>fetch('%s)'</script>", postFunction.getUrl());
    }

    @Override
    public String generate(ValidFunction validFunction) {
        // TODO Auto-generated method stub
        return null;
    }
}
