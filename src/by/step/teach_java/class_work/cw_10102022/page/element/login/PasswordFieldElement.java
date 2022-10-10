package by.step.teach_java.class_work.cw_10102022.page.element.login;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;
import by.step.teach_java.class_work.cw_10102022.page.element.Input;

@Element(elementName = "Password field element")

public class PasswordFieldElement extends Input {

    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
