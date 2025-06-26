package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        for (Item item : items) {
            boolean isAgedBrie = item.name.equals("Aged Brie");
            boolean isBackstage = item.name.equals("Backstage passes to a TAFKAL80ETC concert");
            boolean isSulfuras = item.name.equals("Sulfuras, Hand of Ragnaros");
            boolean isSpecial = isAgedBrie || isBackstage;
            // devided into two categories, special and not special
            // this will update the quality of an item
            if (!isSpecial) {
                if (item.quality > 0 && !isSulfuras) {
                    item.quality--;
                }
            } else {
                if (item.quality < 50) {
                    item.quality++;
    
                    if (isBackstage) {
                        if (item.sellIn < 11 && item.quality < 50) item.quality++;
                        if (item.sellIn < 6 && item.quality < 50) item.quality++;
                    }
                }
            }
    

            // this will update sellIn 
            if (!isSulfuras) {
                item.sellIn--;
            }
    
            // rules after expiration
            if (item.sellIn < 0) {
                if (!isAgedBrie) {
                    if (!isBackstage) {
                        if (item.quality > 0 && !isSulfuras) {
                            item.quality--;
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality++;
                    }
                }
            }
        }
    }
    
        
}
