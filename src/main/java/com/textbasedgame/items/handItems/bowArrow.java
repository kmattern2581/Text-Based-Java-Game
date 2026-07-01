package com.textbasedgame.items.handItems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.textbasedgame.items.genericItems.holdables;

public class bowArrow extends holdables {
    private final int damage;
    private static final Set<String> tags = new HashSet<>(Arrays.asList("Agility", "Bow and Arrow", "Wood","light" ));

    
    public bowArrow(){
        damage = (int)(1.7*quality);
        setPrice(40);
        setName("Bow and Arrow");
        setDMGType(damageTypes.AGILITY);
        
    }
    
    public bowArrow(int qual){
        setQuality(qual);
        damage = (int)(1.7*quality);
        setPrice(40);
        setName("Bow and Arrow");
        setDMGType(damageTypes.AGILITY);
    }
@Override
    public int getItemDamage() {
        return damage;
    }
    @Override
    public String getAttackString() {
        return "shoot";
    }
    @Override
    protected Set<String> getTagsSet() {
        return tags;
    }
    @Override
    public void printInfo() {}
}
