package by.step.teach_java.class_work.cw_10102022.service;

import by.step.teach_java.class_work.cw_10102022.annotation.Service;
import by.step.teach_java.class_work.cw_10102022.page.PresentPage;
import by.step.teach_java.class_work.cw_10102022.service.service_interface.HasPresentPage;

@Service(serviceName = "Present page service")

public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentPage presentPage = new PresentPage();

    @Override
    public PresentPage getPresentPage() {
        return presentPage;
    }
}
