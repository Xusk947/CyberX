package CyberX.content;

import mindustry.ctype.ContentList;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.LaserTurret;

public class Blocks implements ContentList {

    public static Block test;
    public void load() {
        test = new LaserTurret("ohno"){{
            reloadTime = 1f;
        }};
    }
    
}
