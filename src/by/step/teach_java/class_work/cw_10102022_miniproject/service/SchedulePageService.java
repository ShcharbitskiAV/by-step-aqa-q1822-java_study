package by.step.teach_java.class_work.cw_10102022_miniproject.service;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Service;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.SchedulePage;
import by.step.teach_java.class_work.cw_10102022_miniproject.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")

public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
