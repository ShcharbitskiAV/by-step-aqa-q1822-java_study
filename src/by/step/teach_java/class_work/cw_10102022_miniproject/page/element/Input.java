package by.step.teach_java.class_work.cw_10102022_miniproject.page.element;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;

@Element(elementName = "Input element")

public class Input extends BaseElement {

    public Input (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
