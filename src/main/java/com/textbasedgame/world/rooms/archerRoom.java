package com.textbasedgame.world.rooms;

import com.textbasedgame.GUI.gui;
import com.textbasedgame.GUI.pictureLoader.imageIDs;
import com.textbasedgame.items.handItems.bowArrow;
import com.textbasedgame.items.handItems.escalibur;
import com.textbasedgame.playerFiles.GameProgress;
import com.textbasedgame.playerFiles.player;
import com.textbasedgame.util.GameProgressWrapper;
import com.textbasedgame.util.TrekkerMath;
import com.textbasedgame.util.response;
import com.textbasedgame.items.item;
import com.textbasedgame.items.handItems.escalibur;
import com.textbasedgame.items.genericItems.keyItem;
import com.textbasedgame.items.keyItems.chestKey;

public class archerRoom extends Room {
    private static final imageIDs roomID = imageIDs.LIBRARY;   

    public void openRoom() {
        gui.printOnGameSide("You enter a room whare you see that someone is traped in a medl cage with a sord shaped key hole ");
        gui.printOnGameSide("Help help let me out!");
        gui.printOnGameSide("If you have a excaliber get it out of your pockit and unlock me!");
        
        if(GameProgressWrapper.gameProgress.luckysaved == false){

            boolean ans = response.respondYes(gui.getInput("Would you like to help the archer in the cage?"));
            if(ans == true) {
    
               for(keyItem itm : player.keyItemInventory){
                    if(itm instanceof chestKey){
                        itm.Use();
                        break;
                    }
                }
    
                if(player.inventoryContains(escalibur.class) == true){
                    if(player.LHand instanceof escalibur){
                        player.LHand.Use();
                    }
                    if(player.RHand instanceof escalibur){
                        player.RHand.Use();
                    }
                    for(item i : player.inventory){
                        if(i instanceof escalibur){
                            player.inventory.remove(i);
                            break;
                        }
                        
                    } 
                    GameProgressWrapper.gameProgress.luckysaved = true;
                    gui.printOnGameSide("The excaliber clicks into place and you free the archer. When you try to take the sword out the teeth in the lock are too strong.");
                    gui.printOnGameSide("Lucky: Thanks for saving me here is my bow to show my apprecition.");
    
                    bowArrow b = new bowArrow(6);
                    player.addItemToPlayer(b);
                    return;
                }
            }
            else{
                gui.printOnGameSide("You decide to leve the archer and walk away ");
            }
        }
        else{

        }

    }


    @Override
    public imageIDs getRoomID(){
        return roomID;
    }
}
