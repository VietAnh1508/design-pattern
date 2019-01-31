package com.designpattern.visitor;

public interface Visitor {

    void visit(HtmlParentElement parentElement);

    void visit(HtmlElement element);

}
