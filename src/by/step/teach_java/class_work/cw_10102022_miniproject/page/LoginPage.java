package by.step.teach_java.class_work.cw_10102022_miniproject.page;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Page;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block.login.LanguageBlock;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block.login.LoginFormBlock;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.page_interface.login.HasLanguageBlock;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.page_interface.login.HasLoginFormBlock;

@Page(pageName = "Page page")

public class LoginPage extends BasePage implements HasLoginFormBlock, HasLanguageBlock {

    private LoginFormBlock loginFormBlock = new LoginFormBlock();
    private LanguageBlock languageBlock = new LanguageBlock();


    @Override
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }
}
