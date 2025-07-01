package com.gildedrose.updateQualityStrategy;

import com.gildedrose.Item;
import com.gildedrose.helperFunctions.ItemRules;

public class BackstagePassUpdater  implements ItemUpdater{

    private static final int TEN_DAYS = 10;
    private static final int FIVE_DAYS = 5;
    
    @Override
    public void update(Item item){
        item.sellIn--; 

        if (ItemRules.isExpired(item)) {
            item.quality = 0;
        } else {
            if (ItemRules.canIncreaseQuality(item)) {
                item.quality++;

                if (ItemRules.isWithinDaysUntilEvent(item, TEN_DAYS)) {
                    item.quality++;
                }

                if (ItemRules.isWithinDaysUntilEvent(item, FIVE_DAYS)) {
                    item.quality++;
                }
            }
        }
    }
}
