package by.bsuir.kugach.wt_laba_1.program.task_9;

import by.bsuir.kugach.wt_laba_1.program.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;
    public Basket(){
        this.balls = new ArrayList<>();
    }
    public void AddBall(Ball ball){
        this.balls.add(ball);
    }
    public double getWeight(){
        double weight = 0;
        for (Ball ball:
             balls) {
            weight+=ball.getWeight();
        }
        return weight;
    }

    public int getCountOfBallsOfColor (Color color){
        int count = 0;
        for (Ball ball:
             balls) {
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }
}
