package mirea;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    private static final int kolvo = 5;

    private static final Scanner IN = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList firstPlayerCards = new LinkedList<Integer>();
        LinkedList secondPlayerCards = new LinkedList<Integer>();
        System.out.print("Cards of 1 gamer: ");
        for (int i = 0; i < kolvo; ++i) {
            firstPlayerCards.add(IN.nextInt());
        }
        System.out.print("Cards of 2 gamer: ");
        for (int i = 0; i < kolvo; ++i) {
            secondPlayerCards.add(IN.nextInt());
        }
        int steps = 0;
        while (true) {
            if (steps >= 106) {
                System.out.println();
                System.out.println("botva");
                return;
            }
            if (firstPlayerCards.isEmpty())
                break;
            int firstPlayerCard = (int) firstPlayerCards.poll();
            if (secondPlayerCards.isEmpty())
                break;
            int secondPlayerCard = (int) secondPlayerCards.poll();
            if (firstPlayerCard < secondPlayerCard) {
                if (firstPlayerCard == 0 && secondPlayerCard == 9) {
                    firstPlayerCards.add(firstPlayerCard);
                    firstPlayerCards.add(secondPlayerCard);
                }
                else {
                    secondPlayerCards.add(firstPlayerCard);
                    secondPlayerCards.add(secondPlayerCard);
                }
            }
            else {

                if (firstPlayerCard == 9 && secondPlayerCard == 0) {
                    secondPlayerCards.add(firstPlayerCard);
                    secondPlayerCards.add(secondPlayerCard);
                }
                else {
                    firstPlayerCards.add(firstPlayerCard);
                    firstPlayerCards.add(secondPlayerCard);
                }
            }
            ++steps;
        }
        String winner = (firstPlayerCards.isEmpty()) ? "Winner: second" : "first";
        System.out.println();
        System.out.println(winner + " " + steps);
    }
}