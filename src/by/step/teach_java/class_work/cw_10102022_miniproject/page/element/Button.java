package by.step.teach_java.class_work.cw_10102022_miniproject.page.element;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;

@Element(elementName = "Button element")

public class Button extends BaseElement {

    public Button (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
