package by.step.teach_java.class_work.cw_10102022.page;

import by.step.teach_java.class_work.cw_10102022.annotation.Page;
import by.step.teach_java.class_work.cw_10102022.page.block.TopMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.block.left_menu.FooterLeftMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.block.left_menu.HeaderLeftMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.block.left_menu.NavigationLeftMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.block.main.EventsBlock;
import by.step.teach_java.class_work.cw_10102022.page.block.main.NewsBlock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.HasTopMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.left_menu.HasNavigationLeftMenublock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.main.HasEventsBlock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.main.HasNewsBlock;

@Page(pageName = "Page page")

public class MainPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenublock, HasNewsBlock, HasEventsBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private EventsBlock eventsBlock = new EventsBlock();
    private NewsBlock newsBlock = new NewsBlock();

    @Override
    public TopMenuBlock getTopMenuBlock() {
        return topMenuBlock;
    }

    @Override
    public FooterLeftMenuBlock getFooterLeftMenuBlock() {
        return footerLeftMenuBlock;
    }

    @Override
    public NavigationLeftMenuBlock getNavigationLeftMenuBlock() {
        return navigationLeftMenuBlock;
    }

    @Override
    public HeaderLeftMenuBlock getHeaderLeftMenuBlock() {
        return headerLeftMenuBlock;
    }

    @Override
    public EventsBlock getEventsBlock() {
        return eventsBlock;
    }

    @Override
    public NewsBlock getNewsBlock() {
        return newsBlock;
    }
}
