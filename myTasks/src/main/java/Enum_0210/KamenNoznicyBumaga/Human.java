package Enum_0210.KamenNoznicyBumaga;
import java.util.Scanner;

public class Human implements PlayerInterface {
    int points=0;
    String name;




    public String getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name, please: ");
        String name = input.nextLine();
        return name;
    }



    public int getMove(Computer player){
        Scanner input = new Scanner(System.in);
        int move=0;
        System.out.println("DO you agree to start playing with "+ player.name+ "? Answer 'yes' or 'no'? ");
        String answer = input.nextLine();
                if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Make your move 1-stone,2-scissors or 3- papper ");
             move = input.nextInt();

        } else {
            System.out.println("We hope next time you will play with us :) ");
            System.exit(1);
        }
        return move;
    }



    public void addPoints(){
        ++points;

    }




}
