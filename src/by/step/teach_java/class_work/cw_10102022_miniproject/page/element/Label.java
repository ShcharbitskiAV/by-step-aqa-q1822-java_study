package by.step.teach_java.class_work.cw_10102022_miniproject.page.element;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;

@Element(elementName = "Label element")

public class Label extends BaseElement {

    public Label (String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
