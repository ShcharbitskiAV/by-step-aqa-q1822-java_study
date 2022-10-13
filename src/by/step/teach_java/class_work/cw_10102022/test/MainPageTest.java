import by.step.teach_java.class_work.cw_10102022.service.MainPageService;
import by.step.teach_java.class_work.cw_10102022.service.PresentPageService;

public class MainPageTest {

    private MainPageService mainPageService = new MainPageService();

    public static void main(String[] args) {
       MainPageTest test = new MainPageTest();
       test.checkNewsBlock();

    }
    public void checkNewsBlock () {
        mainPageService.getMainPage().getNewsBlock();
    }
}
