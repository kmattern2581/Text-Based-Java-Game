package com.textbasedgame.monsters.regularMonsters;

import com.textbasedgame.monsters.monster;
import com.textbasedgame.monsters.monsterCreator;

public class zombie extends monster {

    public zombie(){
        super.setName("Zombie");
        super.setStrength(monsterCreator.medMonsterStr(mLevel));
        super.setOriginalHealth(monsterCreator.medMonsterHealth(mLevel));
        super.setSpeed(monsterCreator.slowMonsterSpeed(mLevel));
    }
    @Override
    public String attackString(){
        return "swipes at you with his thick fingers";
    }
    @Override
    public void onMonsterDeath(){
        this.setName("Reborn Zombie");
        this.setHealth(this.getMaxHealth()/3*2);
        this.setStrength(this.getStrength()/3);
        this.setSpeed(this.getSpeed()/3);
    }
}