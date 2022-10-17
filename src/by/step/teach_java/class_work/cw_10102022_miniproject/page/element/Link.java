package by.step.teach_java.class_work.cw_10102022_miniproject.page.element;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;

@Element(elementName = "Link element")

public class Link extends BaseElement {

    public Link (String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
