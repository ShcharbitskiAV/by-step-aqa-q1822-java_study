package by.step.teach_java.class_work.cw_10102022.page.block.login;

import by.step.teach_java.class_work.cw_10102022.annotation.Block;
import by.step.teach_java.class_work.cw_10102022.page.block.BaseBlock;
import by.step.teach_java.class_work.cw_10102022.page.block_interface.login.language_element.HasLanguageElement;
import by.step.teach_java.class_work.cw_10102022.page.block_interface.login.language_element.HasTitleLanguageElement;
import by.step.teach_java.class_work.cw_10102022.page.element.login.language_element.LanguageElement;
import by.step.teach_java.class_work.cw_10102022.page.element.login.language_element.TitleLanguageElement;

@Block(blockName = "Language menu block")

public class LanguageBlock extends BaseBlock implements HasLanguageElement, HasTitleLanguageElement {

    private LanguageElement languageElement = new LanguageElement("selector for language");
    private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("selector for title language");

    @Override
    public LanguageElement getLanguageElement() {
        return languageElement;
    }

    @Override
    public TitleLanguageElement getTitleLanguageElement() {
        return titleLanguageElement;
    }
}
