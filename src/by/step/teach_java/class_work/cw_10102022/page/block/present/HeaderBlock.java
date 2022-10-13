package by.step.teach_java.class_work.cw_10102022.page.block.present;

import by.step.teach_java.class_work.cw_10102022.annotation.Block;
import by.step.teach_java.class_work.cw_10102022.page.block.BaseBlock;
import by.step.teach_java.class_work.cw_10102022.page.page_interface.present.HasHeaderBlock;

@Block(blockName = "Header block")

public class HeaderBlock extends BaseBlock implements HasHeaderBlock {
    @Override
    public HeaderBlock getHeaderBlock() {
        return null;
    }
}
