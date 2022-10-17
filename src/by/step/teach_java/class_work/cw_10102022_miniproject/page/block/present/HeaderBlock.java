package by.step.teach_java.class_work.cw_10102022_miniproject.page.block.present;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Block;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block.BaseBlock;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.page_interface.present.HasHeaderBlock;

@Block(blockName = "Header block")

public class HeaderBlock extends BaseBlock implements HasHeaderBlock {
    @Override
    public HeaderBlock getHeaderBlock() {
        return null;
    }
}
