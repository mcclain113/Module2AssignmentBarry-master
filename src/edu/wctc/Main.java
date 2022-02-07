package edu.wctc;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create the Maze, and a Scanner to read keyboard input.
        Maze maze = new Maze();
        maze.SetPlayer();
        Scanner keyboard = new Scanner(System.in);
        boolean done = maze.isFinished();
        //Begin a loop that will run until the Maze is finished.
    while(!done) {

     //Within the loop:
    //Print the current room description.
        maze.getCurrentRoomDescription();
    //Print the current room exits.
        maze.getCurrentRoomExits();
    //Ask the player for a command and read the input as a char.
        System.out.println("Enter command: ");
        String userInput = keyboard.nextLine().toLowerCase(Locale.ROOT);
        switch (userInput){
            case "n":
                if (maze.move("n") ==true){
                maze.setCurrentRoom(maze.getCurrentRoom().getAdjoiningRoom("n"));}
                else{
                    System.out.println("Nothing in that direction.");
                }
                break;
            case "s":
                if (maze.move("s") ==true){
                maze.setCurrentRoom(maze.getCurrentRoom().getAdjoiningRoom("s"));}
                else{
                    System.out.println("Nothing in that direction.");
                }
                break;
            case "e":
               if (maze.move("e") == true){
                maze.setCurrentRoom(maze.getCurrentRoom().getAdjoiningRoom("e"));}
               else{
                   System.out.println("Nothing in that direction.");
               }
                break;
            case "w":
               if (maze.move("w") ==true){
                maze.setCurrentRoom(maze.getCurrentRoom().getAdjoiningRoom("w"));}
               else{
                   System.out.println("Nothing in that direction.");
               }
               break;
            case "i":
                System.out.println(maze.interactWithCurrentRoom());
                maze.interactWithCurrentRoom();
                if (maze.getCurrentRoom().interactStatus()) {
                    maze.addIntoScore(maze.getCurrentRoom().interactPoints());
                    break;

                }
                else{break;}

            case "l":
                System.out.println(maze.lootCurrentRoom());
                maze.lootCurrentRoom();
                if (maze.getCurrentRoom().lootStatus()){
                    maze.addIntoInventory();
                    int x = maze.getCurrentRoom().lootPoints();
                    maze.addIntoScore(x);
                break;
                }
                else{break;}

            case "x":
                System.out.println(maze.exitCurrentRoom());
                maze.exitCurrentRoom();
                if(maze.getCurrentRoom().exitStatus()){
                    done = true;
                }
                break;
            case "v":
               maze.getPlayerInventory();

                break;
            default:
                System.out.println("Not a vaild selection. Try again.");
                ;
                break;
        }
    //The commands 'n', 's', 'e', 'w', 'u', and 'd' will attempt to move the player in that direction. If the movement is not valid, print a message that says so.


}
        //When the maze is finished, print the player's score.
        int finalScore = maze.getPlayerScore();

        System.out.println("Game over.  You scored" + " " + finalScore + " " + "points.");



    }
}
