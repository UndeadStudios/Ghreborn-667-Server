// Item Spawn Points by xerozcheez
import java.io.*;


public class itemspawnpoints {
    public int spawntimer = 0;

    public void LoadItems() {
        for (int i = 0; i <= 5000; i++) {
            if (spawntimer <= 1) {
                ItemHandler.addItem(2414, 3118, 9848, 1,
                        ItemHandler.globalItemController[i], false); // Zammy Cape
                ItemHandler.addItem(2412, 3119, 9848, 1,
                        ItemHandler.globalItemController[i], false); // Sara Cape
                ItemHandler.addItem(2413, 3120, 9848, 1,
                        ItemHandler.globalItemController[i], false); // Guthix Cape
                ItemHandler.addItem(6568, 2527, 4646 , 1,
                        ItemHandler.globalItemController[i], false); // Guthix Cape
                ItemHandler.addItem(995, 3268, 3352, 10000000,
                        ItemHandler.globalItemController[i], false); // Guthix Cape
                ItemHandler.addItem(995, 3266, 3352, 10000000,
                  ItemHandler.globalItemController[i], false); // idk
                spawntimer = 100;
            }
        }
    }

    public void process() {
        LoadItems();
        spawntimer -= 1;
    }
}
