package by.bsuir.kugach.wt_laba_1.program.task_9;

import by.bsuir.kugach.wt_laba_1.program.enums.Color;

public class Ball {
    private Color color;
    private Double weight;
    public Ball(Color color, Double weight){
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
