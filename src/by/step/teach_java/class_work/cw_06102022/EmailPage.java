package by.step.teach_java.class_work.cw_06102022;

import by.step.teach_java.class_work.cw_06102022.registration_block.Registrationblock;

public class EmailPage extends BasePage implements HasRegistrationBlock {

    @Override
    public Registrationblock getRegistrationblock() {
        return new Registrationblock();
    }
}
