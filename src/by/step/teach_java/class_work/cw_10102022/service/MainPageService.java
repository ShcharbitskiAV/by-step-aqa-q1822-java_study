package by.step.teach_java.class_work.cw_10102022.service;

import by.step.teach_java.class_work.cw_10102022.annotation.Page;
import by.step.teach_java.class_work.cw_10102022.annotation.Service;
import by.step.teach_java.class_work.cw_10102022.page.MainPage;
import by.step.teach_java.class_work.cw_10102022.service.service_interface.HasMainPage;

@Service (serviceName = "Main page service")

public class MainPageService extends BaseService implements HasMainPage {

    private MainPage mainPage = new MainPage();

    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
