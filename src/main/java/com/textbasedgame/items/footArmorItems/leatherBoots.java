package com.textbasedgame.items.footArmorItems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.textbasedgame.items.genericItems.boots;

public class leatherBoots extends boots {
    private static final Set<String> tags = new HashSet<>(Arrays.asList("leatherBoots", "leather", "Shoes", "Boots","light", "Heavy", "Heavy Armor"));
    public leatherBoots(){
        armorAdd = (int)(this.quality * 1.25);
        setPrice(5);
        setName("letherBoots");
        setDescription("Some truly uncomfortable lether shoes. It seems to be better than nothing but only slightly. You can see how these would aid you in any special way.");
    }
    
    @Override
    protected Set<String> getTagsSet() {
        return tags;
    }
    @Override
    public void printInfo() {}
}