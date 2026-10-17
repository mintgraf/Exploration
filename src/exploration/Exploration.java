package exploration;

import arc.*;
import arc.graphics.Color;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.type.Item;
import mindustry.ui.dialogs.*;

public class Exploration extends Mod{

    public Exploration(){
        Log.info("Loaded ExampleJavaMod constructor.");
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");

        Items.load();
    }

}
