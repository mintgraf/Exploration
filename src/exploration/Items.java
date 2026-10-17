package exploration;

import arc.graphics.Color;
import mindustry.type.Item;

public class Items {
    public static Item copper;

    public static void load(){
        copper = new Item("copper", Color.brown);
    }
}
