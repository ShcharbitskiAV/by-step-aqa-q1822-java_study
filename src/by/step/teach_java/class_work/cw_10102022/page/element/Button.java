package by.step.teach_java.class_work.cw_10102022.page.element;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;

@Element(elementName = "Button element")

public class Button extends BaseElement {

    public Button (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
