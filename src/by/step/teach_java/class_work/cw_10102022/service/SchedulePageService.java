package by.step.teach_java.class_work.cw_10102022.service;

import by.step.teach_java.class_work.cw_10102022.annotation.Service;
import by.step.teach_java.class_work.cw_10102022.page.SchedulePage;
import by.step.teach_java.class_work.cw_10102022.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")

public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
