package by.step.teach_java.class_work.cw_10102022.page.element;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;

@Element(elementName = "Input element")

public class Input extends BaseElement {

    public Input (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
