package Enum_0210.KamenNoznicyBumaga;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game main = new Game();
        Human playerH = new Human();

        Computer playerC = new Computer("Steeve Jobs");
        playerH.getName();

        main.checkWhoWon(playerH, playerC);


    }

   Game(){


   }

    public void checkWhoWon(Human playerH, Computer playerC) {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            int choiceH = playerH.getMove(playerC);
            int choiceM = playerC.getMove(playerC);
            //1-stone,2-scissors or 3- papper
            if (choiceH == MoveVariant.Stone.choice && choiceM == MoveVariant.Scissors.choice || choiceH ==  MoveVariant.Scissors.choice  && choiceM == MoveVariant.Papper.choice || choiceH == MoveVariant.Papper.choice && choiceM == MoveVariant.Stone.choice) {
                System.out.println("Your enemy has chosen " + choiceM + ", you - " + choiceH + ". You won 1 point.");
                playerH.addPoints();
                System.out.println("Your score is -  You vs Computer: " + playerH.points + " : " + playerC.points);
            }
            if (choiceH ==  MoveVariant.Scissors.choice  && choiceM == MoveVariant.Stone.choice || choiceH == MoveVariant.Papper.choice && choiceM ==  MoveVariant.Scissors.choice  || choiceH == MoveVariant.Stone.choice && choiceM == MoveVariant.Papper.choice) {
                System.out.println("You enemy has chosen " + choiceM + ", you - " + choiceH + ". " + playerC.name + " won 1 point.");
                playerC.addPoints();
                System.out.println("Your score is -  You vs Computer: " + playerH.points + " : " + playerC.points);
            }
            if ((choiceH == choiceM)) {
                System.out.println("You both have chosen " + choiceH + " option. So you both do not receive a point");
            }


            System.out.println("Do you want to continiu playing? 'yes' or 'no'");
            String answer = input.nextLine();
            if (answer.equals("yes") || answer.equals("y")) {
                continue;
            } else {

                    System.out.println("Thank you for Game. See you again");
                    System.out.println("Your score is You vs Computer: " + playerH.points + " : " + playerC.points);
                    System.exit(1);

                }
            }
        }


    }




