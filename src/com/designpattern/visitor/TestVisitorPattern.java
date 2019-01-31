package com.designpattern.visitor;

public class TestVisitorPattern {

    public static void main(String[] args) {
        System.out.println("---------- Before visitor ----------");

        HtmlTag root = new HtmlParentElement("html");
        root.setStartTag("<html>");
        root.setEndTag("</html>");

        HtmlTag body = new HtmlParentElement("body");
        body.setStartTag("<body>");
        body.setEndTag("</body>");

        root.addChildTag(body);

        HtmlTag p1 = new HtmlElement("p");
        p1.setStartTag("<p>");
        p1.setEndTag("</p>");
        p1.setTagBody("paragraph 1");

        HtmlTag p2 = new HtmlElement("p");
        p2.setStartTag("<p>");
        p2.setEndTag("</p>");
        p2.setTagBody("paragraph 2");

        body.addChildTags(p1, p2);

        root.generateHtml();

        System.out.println("---------- After visitor ----------");

        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();

        body.removeChildTag(p1);
        body.removeChildTag(p2);

        body.accept(cssClass);

        p1 = new HtmlElement("p");
        p1.setStartTag("<p>");
        p1.setEndTag("</p>");
        p1.setTagBody("paragraph 1");
        p1.accept(style);
        p1.accept(cssClass);

        p2 = new HtmlElement("p");
        p2.setStartTag("<p>");
        p2.setEndTag("</p>");
        p2.setTagBody("paragraph 2");
        p2.accept(style);
        p2.accept(cssClass);

        body.addChildTags(p1, p2);

        root.generateHtml();
    }

}
