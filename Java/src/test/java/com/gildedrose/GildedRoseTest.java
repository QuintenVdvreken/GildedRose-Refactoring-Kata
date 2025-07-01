package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void standardItem_degradesNoramlly(){
        Item[] items = { new Item("Elixir of the Mongoose", 5, 10)};
        GildedRose main = new GildedRose(items);
        main.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(9, items[0].quality);
    }

    @Test
    void standardItem_degradesTwiceAsFastAfterSellInDate(){
        Item[] items = { new Item("Elixir of the Mongoose", 0, 10)};
        GildedRose main = new GildedRose(items);
        main.updateQuality();   
        main.updateQuality();
        main.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(4, items[0].quality); 
    }

    @Test
    void agedBrie_increasesInQuality() {
        Item[] items = { new Item("Aged Brie", 2, 0) };
        GildedRose main = new GildedRose(items);
        main.updateQuality();
        assertEquals(1, items[0].quality);
        assertEquals(1, items[0].sellIn);
    }

    

    @Test
    void backstagePasses_increaseInQualityWithOne(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };

        GildedRose main = new GildedRose(items);
        main.updateQuality();

        assertEquals(14, items[0].sellIn); 
        assertEquals(21, items[0].quality); 
    }

    @Test
    void backstagePasses_increaseInQualityWithTwo(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };

        GildedRose main = new GildedRose(items);
        main.updateQuality();

        assertEquals(9, items[0].sellIn); 
        assertEquals(22, items[0].quality);  
    }

    @Test
    void backstagePasses_increaseInQualityWithThree(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };

        GildedRose main = new GildedRose(items);
        main.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(23, items[0].quality);  
    }

    @Test
    void sulfuras_doesNotChange(){
        Item[] items = { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose main = new GildedRose(items);
        main.updateQuality();

        assertEquals(0,items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

    
    // not implemented yet
    @Test
    void conjuredItems_degradeTwiceAsFast(){
        Item[] items = { new Item("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, items[0].sellIn);
        assertEquals(4, items[0].quality);
    }
        
}
