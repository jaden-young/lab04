package lab04;

import java.util.Scanner;

/**
 * Creates a singly linked list that represents the members of the NDSU Men's 
 * Basketball team, stored as Player objects, and another singly linked list 
 * that holds course ID's as strings.
 * @author Jaden Young
 */
public class NDSUBasketBall {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        LinkedBag<Player> team = new LinkedBag();
        final int NUM_PLAYERS = 14; // magic numbers are worse than toejam

        System.out.println("--------- NDSU Basketball Team Roster ---------");
        for(int i = 0; i < NUM_PLAYERS; i++) {
            System.out.println("Player " + i + ":");
            // get name
            System.out.print("Name > ");
            String name = scan.nextLine();
            // get position
            System.out.print("Position > ");
            String position = scan.nextLine();
            // get number
            System.out.print("Jersey number > ");
            while(!scan.hasNextInt()) {
                String garbage = scan.nextLine();
                System.out.print("Needs to be between 0 and 99 > ");
            }
            int number = scan.nextInt();
            // add player to team
            team.add(new Player(name, position, number));
            //eats extra character left behind
            scan.nextLine();
        }
        
        System.out.println("\n\n\n");
        //remove the first player
        team.remove();
        
        //add a player with made up info
        Player cletus = new Player("Cletus Spuckler", "4th Grade", 1);
        
        System.out.println("Size of the team: " + team.getCurrentSize());
        
        team.remove(cletus);
        
        //print the entire list
        int currentSize = team.getCurrentSize();
        for(int i = 0; i < currentSize; i++) {
            System.out.println("Player " + i + ":");
            System.out.println(team.getItem(i).toString());
        }
        
        LinkedBag<String> courses = new LinkedBag();
        courses.add("MATH 166");
        courses.add("SPAN 312");
        courses.add("CSCI 161");
        courses.add("HNES 111");
        courses.add("COMM 111");
        
        courses.remove("CSCI 161");
        
        System.out.println("\n\n\n");
        currentSize = courses.getCurrentSize();
        for(int i = 0; i < currentSize; i++) {
            System.out.println(courses.getItem(i));
        }
    }
}
