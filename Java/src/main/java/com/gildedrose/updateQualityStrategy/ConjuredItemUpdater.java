package com.gildedrose.updateQualityStrategy;

import com.gildedrose.Item;

public class ConjuredItemUpdater implements ItemUpdater {

    @Override
    public void update(Item item){
        if(item.quality > 0) {
            item.quality -= 2; 
            if(item.quality<0) item.quality =0; 
        }

        item.sellIn--;

        if(item.sellIn < 0 && item.quality > 0){
            item.quality -=2;
            if(item.quality < 0) item.quality=0;
        }
    }

}
