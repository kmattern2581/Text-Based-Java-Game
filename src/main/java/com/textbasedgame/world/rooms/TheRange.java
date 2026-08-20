package com.textbasedgame.world.rooms;

import com.textbasedgame.GUI.pictureLoader.imageIDs;
import com.textbasedgame.GUI.*;

public class TheRange extends Room {
    private static final imageIDs roomID = imageIDs.LIBRARY;
    
    @Override
    public imageIDs getRoomID(){
        return roomID;
    }
    @Override
    public void openRoom(){
        super.openRoom();
       
        gui.printOnGameSide("You walk in a cold room with targets lineing the walls.");
        gui.printOnGameSide("You see that some of the targets are big and some are small.");
    }
} 
