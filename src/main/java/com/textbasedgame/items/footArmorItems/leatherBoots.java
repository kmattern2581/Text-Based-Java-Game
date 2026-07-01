package com.textbasedgame.items.footArmorItems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.textbasedgame.items.genericItems.boots;

public class leatherBoots extends boots {
    private static final Set<String> tags = new HashSet<>(Arrays.asList("leatherBoots", "leather", "Shoes", "Boots","light", "Heavy", "Heavy Armor"));
    public leatherBoots(){
    }
    
    @Override
    protected Set<String> getTagsSet() {
        return tags;
    }
    @Override
    public void printInfo() {}
}