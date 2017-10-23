package CupsGame;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Смоделировать игру в наперстки. Классы для игры: игрок, стаканчики, игра.
        У игрока есть запас игровых очков. Каждая попытка стоит некоторое их количество. Если у игрока не осталось очков - он не может продолжать игру.
*/

public class Game {

    public static int playerChoice() {
        int choice = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("Please choose the cup: 1, 2 or 3");
                choice = in.nextInt();
                if ((choice != 1 && choice != 2 && choice != 3)) {
                    throw new Exc1();
                } else
                    break;
            } catch (InputMismatchException exs) {
                System.out.println("This is not a number");
            } catch (Exc1 exs) {
                System.out.println("There is no such cup, please chose again");
            }
        }
        return choice;
    }

    public static void main(String[] args) {

        Computer john = new Computer();
        Player sara = new Player();

        while (true) {
            while (true) {
                if (sara.points == sara.winPoints) {
                    System.out.println("Congratulations. You achieved 8 points and you won in the war!");
                    System.out.println("*         *         *  *  *    *");
                    System.out.println(" *       * *       *      **   *");
                    System.out.println("  *     *   *     *    *  * *  *");
                    System.out.println("   *   *     *   *     *  *  * *");
                    System.out.println("    * *       * *      *  *   **");
                    System.out.println("     *         *       *  *    *");
                    break;
                } else {
                    if (sara.points == 0) {
                        for (int ii = 0; ii < 10; ii++) {
                            System.out.println("ZERO points. YOU are a loser. mehhh ");
                        }
                        System.out.println("*         **     *****   *****  ****  ");
                        System.out.println("*       *    *  *        |      *  *  ");
                        System.out.println("*      *      *  *****   *****  ****  ");
                        System.out.println("*       *    *        *  |      * *   ");
                        System.out.println("******    **     *****   *****  *  *  ");
                        break;
                    } else {
                        int CupNo = john.hideBall();
                        int choice = playerChoice();

                        if (choice == CupNo) {
                            System.out.println("It's under " + CupNo + " cup.");
                            ++sara.points;
                            System.out.println("You won. You have +1 point. You have now " + sara.points + " points.");

                        } else {
                            System.out.println("It's under " + CupNo + " cup.");
                            --sara.points;
                            System.out.println("You lost, -1 point. You have left " + sara.points + " points.");
                        }
                    }
                }
            }
            System.out.println("Do you wand to plain again? (yes or no)");
            Scanner in = new Scanner(System.in);
            String var = in.next();
            if(var.equals("y") || var.equals("yes")) { sara.points =5; }else break;
            }
        }
    }


