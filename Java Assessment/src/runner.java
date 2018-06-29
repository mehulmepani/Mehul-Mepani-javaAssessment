import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        compass possition = new compass("5", "0", "0", "0");
        player newplayer1 = new player();



// starting of barren moor

        System.out.println("You awaken to find yourself in a barren moor. Try “look”");

        // scanner introduced
        Scanner sc = new Scanner(System.in);
        String looking = sc.next();
        if (looking == "look") {
            System.out.println("Grey foggy clouds float oppressively close to you,\n" +
                    "reflected in the murky grey water which reaches up your\n" +
                    "shins.");
        }

        //another scanner taking in north, east, south, west.
        Scanner direction = new Scanner(System.in);
        System.out.println("Grey foggy clouds float oppressively close to you,\n" +
                "reflected in the murky grey water which reaches up your\n" +
                "shins.\n" +
                "Some black plants barely poke out of the shallow water.\n" +
                "Try “north”,”south”,”east”,or “west”\n" +
                "You notice a small watch-like device in your left hand.\n" +
                "It has hands like a watch, but the hands don’t seem to tell\n" +
                "time.");
        //switch case where if user entered north, east, south, west, it will print the case.
        String location = direction.next();

        switch (location) {
            case "north":
                System.out.println("north" + " The dial reads 5m");
                break;

            case "east":
                System.out.println("east" + " The dial reads 8m");
                break;

            case "south":
                System.out.println("south" + " The dial reads 20m");
                break;

            case "west":
                System.out.println("west" + " The dial reads 25m");
                break;
        }

// second time asking for north, east, south, west
        Scanner new_location = new Scanner(System.in);

        System.out.println("You awaken to find yourself in a barren moor. Try “look”");
        String location_2 = new_location.next();

        if (location_2.equals("north")) {
            System.out.println("north" + " The dial reads 1m");
        } else if (location_2.equals("east")) {
            System.out.println("east" + " The dial reads 4m");
        } else if (location_2.equals("south")) {
            System.out.println("south" + " The dial reads 14m");
        } else if (location_2.equals("west")) {
            System.out.println("west" + " The dial reads 20m");
        } else {
            System.out.println("Not a Valid entry");
        }

        Scanner last  = new Scanner(System.in);
        String location_last = last.next();
        if (location_last.equals("north")) {
            System.out.println("You see a box sitting on the plain. Its filled with\n" +
                    "treasure! You win! The end.");
        }
        else {
            System.out.println("you loose! The end");
        }







    }
}
