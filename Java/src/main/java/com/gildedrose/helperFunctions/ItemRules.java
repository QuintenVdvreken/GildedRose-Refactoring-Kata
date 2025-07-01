package com.gildedrose.helperFunctions;

import com.gildedrose.Item;

public class ItemRules {
    public static boolean isExpired(Item item){
        return item.sellIn < 0;
    }

    public static boolean hasQuality(Item item){
        return item.quality > 0;
    }

    public static boolean canIncreaseQuality(Item item){
        return item.quality < 50;
    }

    public static boolean isWithinDaysUntilEvent(Item item, int days) {
        return item.sellIn <= days;
    }
}
