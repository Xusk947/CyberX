package CyberX;

import CyberX.content.Blocks;
import mindustry.ctype.ContentList;
import mindustry.mod.Mod;

/**
 *
 * @author Xusk
 */
public class MainX extends Mod {
    
    public ContentList[] content = new ContentList[] {
        new Blocks()
    };
    
    public MainX() {
        
    }
    
    @Override
    public void loadContent() {
        for (ContentList contentList : content) {
            contentList.load();
        }
    }
}
