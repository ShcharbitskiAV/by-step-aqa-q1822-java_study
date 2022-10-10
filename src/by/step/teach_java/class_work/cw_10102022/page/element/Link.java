package by.step.teach_java.class_work.cw_10102022.page.element;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;

@Element(elementName = "Link element")

public class Link extends BaseElement {

    public Link (String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
