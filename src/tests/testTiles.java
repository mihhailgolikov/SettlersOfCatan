package tests;

import boardClasses.Tile;
import boardClasses.Tiles;

/**
 * Created by patrick on 4/14/17.
 */
public class testTiles {
    public static void main(String[] args){
        Tiles myTiles = new Tiles();

        for(Tile thisTile: myTiles.getTiles()){
            System.out.print("Grid Reference: " + thisTile.getGridPointReference() + ", ");
            System.out.print("Resource Type: " + thisTile.getResource() + ", ");
            System.out.print("Circle Token: " + thisTile.getToken().getNumber() + " " + thisTile.getToken().getLetterOnToken()+ "\n");
        }
    }
}
