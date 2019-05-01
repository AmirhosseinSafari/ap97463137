package assignment7;

import  java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("This program is for training object oriented programming.");

        Shape []shapArray = new Shape[10];

        Random random = new Random();

        int rnd;
        int rndval1,rndval2;

        for(int i =0; i<10 ; i++){
            rnd =random.nextInt(3);
            rndval1 = random.nextInt(10);
            rndval2 = random.nextInt(10);
            switch (rnd){
                case 0:
                    shapArray[i] = new Circle(rndval1);
                    break;
                case 1:
                    shapArray[i] = new Rectangle(rndval1,rndval2);
                    break;
                case 2:
                    shapArray[i] = new Square(rndval1);
                    break;
            }
        }

        System.out.println("before sorting:\n");
        for(Shape shape: shapArray) {
            System.out.format("%s\n", shape.toString());
        }

        Arrays.sort(shapArray);
        System.out.println("\n\n");

        System.out.println("After sorting:\n");
        for(Shape shape: shapArray) {
            System.out.format("%s\n", shape.toString());
        }


    }
}
