package com.brightpaths.mars;
import java.util.Objects;
import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
        MarsGame();
    }

    public static void MarsGame() {
        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        System.out.println("Hi there! What's your name?");
        String name = input.nextLine();

        System.out.println(" ");

        System.out.println("Hi " + name + " ---Welcome to the Mars Adventure Game!");
        System.out.println("You just received a call from your friend who works at NASA");
        System.out.println("They need a person for a mission to mars and chose you as top pick!");

        System.out.println(" ");

        System.out.println("Are you ready? Type Y or N");
        String yesOrNo = input.nextLine();

        if (Objects.equals(yesOrNo, "Y")) {
            System.out.println("I knew you'd say that. You were born ready. ");
        } else {
            System.out.println("This was your big break, sorry to hear it!");
            return;
        }

        System.out.println(" ");

        System.out.println("Now it is time to pack for your trip to Mars!");
        System.out.println("How many suitcases do you plan on bringing?");
        int suitcases = input.nextInt();
        input.nextLine();
        if ( suitcases > 2) {
            System.out.println("Woah, woah keep it light!");
            System.out.println("Please try to fit your stuff in two cases.");
        } else if (suitcases == 2) {
            System.out.println("That's perfect!");
        } else {
            System.out.println("Your packing skills are immaculate");
        }

        System.out.println(" ");

        System.out.println("You're allowed to bring one kind of companion animal with you.");
        System.out.println("What kind of companion animal would you like to bring?");
        String animal = input.nextLine();

        System.out.println("What's your companion's name?");
        String animalName = input.nextLine();
        System.out.println("Cool! " + animalName + " the " + animal + " is headed to Mars!");

        System.out.println(" ");

        System.out.println("NASA has a team of interior designers to get to ridin' in style!");
        System.out.println("They put together a couple options for your ship");

        System.out.println(" ");

        System.out.println("Your options are:");
        System.out.println("A Rustic, farmhouse");
        System.out.println("B Sleek, modern minimalism");
        System.out.println("C Bohemian Chic");
        System.out.println("Which decor style would you like? Choose A B or C.");
        String decor = input.nextLine();
        System.out.println("I can picture it now, " + name + " and " + animalName + " take to the galaxy in...");
        if (Objects.equals(decor, "A")) {
            System.out.println("A rustic spaceship!");
        } else if (Objects.equals(decor, "B")) {
            System.out.println("A sleek spaceship.");
        } else {
            System.out.println("A groovy spaceship!");
        }
        System.out.println( name + " the day is here!");
        System.out.println("You crawl into the spaceship with " + animalName);
        System.out.println("Brace for takeoff!");

        System.out.println(" ");

        System.out.println("5 ...");
        System.out.println("4 ...");
        System.out.println("3 ...");
        System.out.println("2 ...");
        System.out.println("1 ...");
        System.out.println("*LIFTOFF*");


    }
}
