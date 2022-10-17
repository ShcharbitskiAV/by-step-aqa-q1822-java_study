package by.step.teach_java.class_work.cw_10102022_miniproject.page.page_interface.main;

import by.step.teach_java.class_work.cw_10102022_miniproject.page.block.main.NewsBlock;

public interface HasNewsBlock {

    NewsBlock getNewsBlock();

    default void showNewsBlockElement () {
        System.out.println(getNewsBlock().elementSelector);
    }
}
