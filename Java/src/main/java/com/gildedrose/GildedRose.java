package com.gildedrose;

import com.gildedrose.updateItemFactory.ItemUpdaterFactory;
import com.gildedrose.updateQualityStrategy.ItemUpdater;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
       for (Item item : items){
            ItemUpdater updater = ItemUpdaterFactory.getUpdaterFor(item);
            updater.update(item);
       }
    }
    
        
}
