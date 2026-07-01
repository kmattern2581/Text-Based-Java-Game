package com.textbasedgame.util;
import java.util.Random;
public class TrekkerMath {
    
    public static Random rand = new Random();
    
    //random integer generator [lowerBound, upperBound)
    public static int randomInt(int upperBound, int lowerBound){
        if(upperBound <= lowerBound){
            return upperBound;
        }
        int ret = (rand.nextInt(upperBound-lowerBound)) + lowerBound;
        return ret;
    }
    //Exclusive double generator
    public static double randomDouble(double upperBound, double lowerBound){
        if(upperBound <= lowerBound){
            return upperBound;
        }
        double ret = lowerBound + (upperBound - lowerBound) * rand.nextDouble();
        return ret;
    }

    public static boolean arrContains(String[] array, String string){
        for(String e: array){
            if(e.equals(string)){
                return true;
            }
        }
        return false;
    }
    public static boolean arrContains(int[] array, int i){
        for(int e: array){
            if(e == i){
                return true;
            }
        }
        return false;
    }
    public static boolean arrContains(double[] array, double d){
        for(double e: array){
            if(e == d){
                return true;
            }
        }
        return false;
    }

}
