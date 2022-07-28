package generator;

import static j2html.TagCreator.*;

public class HtmlGenerator implements Generator {
    public String generate() {
        return html(
                head(title("Salem Domani")),
                body(
                        h1("Hello, World!"),
                        img().withSrc("/img/hello.png")))
                .renderFormatted();
    }
}
