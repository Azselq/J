package mirea;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

        ArrayList<String> ball = new ArrayList<String>();
        ball.add("BALL1");
        ball.add("BALL2");
        ball.add("BALL3");
        ball.add(1, "BALL4");

        System.out.println("В ячейке номер 2 находится: " + ball.get(1));

        ball.set(1, "fakeBALL2");

        System.out.println("Мы его заменили на " + ball.get(1));

        System.out.println("В списке нахоидтся  " + ball.size() + " мячей ");

        for(String balls : ball){
            System.out.println(ball);
        }

        if(ball.contains("BALL1")){
            System.out.println("В списке есть мяч BALL1");
        }

        ball.remove("BALL1");

        ball.remove(2);

        System.out.println("После удаления остались:");

        Object[] balls = ball.toArray();
        for(Object mya4 :balls){
            System.out.println(mya4);
        }

    }
}