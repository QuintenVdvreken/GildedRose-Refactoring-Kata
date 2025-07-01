package com.gildedrose.updateQualityStrategy;

import com.gildedrose.Item;
import com.gildedrose.helperFunctions.ItemRules;

public class AgedBrieUpdater implements ItemUpdater{
    
    @Override
    public void update(Item item){
        item.sellIn --; 

        if (ItemRules.canIncreaseQuality(item)) {
            item.quality++;
        }

        if (ItemRules.isExpired(item) && ItemRules.hasQuality(item)) {
            item.quality++;
        }
    }
}
