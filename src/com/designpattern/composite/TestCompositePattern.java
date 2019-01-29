package com.designpattern.composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");

        parentTag.addChildTag(p1);

        HtmlTag child = new HtmlElement("<p>");
        child.setStartTag("<p>");
        child.setEndTag("</p>");
        child.setTagBody("Testing html tag library");

        p1.addChildTag(child);

        child = new HtmlElement("<p>");
        child.setStartTag("<p>");
        child.setEndTag("</p>");
        child.setTagBody("Paragraph 2");

        p1.addChildTag(child);

        parentTag.generateHtml();
    }

}
