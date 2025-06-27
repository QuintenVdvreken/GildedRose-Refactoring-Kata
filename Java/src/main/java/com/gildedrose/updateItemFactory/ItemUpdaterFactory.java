package com.gildedrose.updateItemFactory;

import com.gildedrose.Item;
import com.gildedrose.updateQualityStrategy.AgedBrieUpdater;
import com.gildedrose.updateQualityStrategy.BackstagePassUpdater;
import com.gildedrose.updateQualityStrategy.ConjuredItemUpdater;
import com.gildedrose.updateQualityStrategy.DefaultItemUpdater;
import com.gildedrose.updateQualityStrategy.ItemUpdater;
import com.gildedrose.updateQualityStrategy.SulfurasUpdater;

public class ItemUpdaterFactory {

    public static ItemUpdater getUpdaterFor(Item item){
        String name = item.name; 
        
        switch (name) {
            case "Aged Brie":
                return new AgedBrieUpdater();
        
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassUpdater();
            
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasUpdater();
              
            default:
               if (name.toLowerCase().startsWith("conjured")) {
                    return new ConjuredItemUpdater();
                }
                return new DefaultItemUpdater();
        }
    }
}
