package com.gildedrose.updateQualityStrategy;

import com.gildedrose.Item;
import com.gildedrose.helperFunctions.ItemRules;

public class DefaultItemUpdater implements ItemUpdater {

    @Override
    public void update(Item item){
        item.sellIn--; 

        if (ItemRules.hasQuality(item)) {
            item.quality--;
          
            if (ItemRules.isExpired(item)) { 
                item.quality--; 
           }
        }
    }
}
 
