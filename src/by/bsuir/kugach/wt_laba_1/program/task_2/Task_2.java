package by.bsuir.kugach.wt_laba_1.program.task_2;

import by.bsuir.kugach.wt_laba_1.program.interfaces.ITask;

import java.util.Scanner;

public class Task_2 implements ITask {
    private double x;
    private double y;

    private boolean IsInRange(double x, double y){
        return ((Math.abs(x) <= 6) && (y <= 0) && (y >= -3)||((Math.abs(x) <= 4) && (y <= 5) && (y >= 0)));
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        this.x = in.nextDouble();
        System.out.println("Enter y: ");
        this.y = in.nextDouble();
    }

    @Override
    public void SolveTask() {
        System.out.print("Answer: ");
        System.out.println(IsInRange(this.x, this.y));
    }
}
