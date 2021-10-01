import java.util.*;

public class adventure {
    public static void main(String[] args) {

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("you will start from room 1 and search to find the end point.");
        Scanner s = new Scanner(System.in);

        //The commands to do an action in the game
        String actions = s.nextLine();

        if (actions.equals("go north")) {
            System.out.println("you went north");

        } else if (actions.equals("go south")) {
            System.out.println("you went south");

        } else if (actions.equals("go east")) {
            System.out.println("you went east");

        } else if (actions.equals("go west")) {
            System.out.println("you went west");

        } else if (actions.equals("look")) {
            System.out.println("there are items and dirt in the room");

        } else if (actions.equals("help")) {
            helpGuide();

        } else
            System.out.println("unknown action");
    }

    //The help guide on how to play the game
    public static void helpGuide() {
        String [] help = {"type directions to go somewhere like 'north' or 'south'", "type 'look' to scout room", "type 'exit' to quit game"};
        System.out.println(help[0]);
        System.out.println(help[1]);
        System.out.println(help[2]);

    }

    }





