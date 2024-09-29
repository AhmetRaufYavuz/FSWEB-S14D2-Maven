package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(LampType.NEON, true,100);
        Ceiling ceiling = new Ceiling(3, PaintColor.GREEN);
        Bed bed = new Bed("double",2,2,2,2);
        Wall northWall = new Wall("north");
        Wall eastWall = new Wall("east");
        Wall westWall = new Wall("west");
        Wall southWall = new Wall("south");
        Wall[] walls = new Wall[]{northWall,eastWall,westWall,southWall};


        Bedroom bedroom = new Bedroom(northWall,eastWall,westWall,southWall,
                ceiling,lamp,new Carpet(2,2,PaintColor.GREEN),
                "ahmet",bed,new Wardrobe(2,2,2.8));

        bedroom.createBedroom();
    }
}