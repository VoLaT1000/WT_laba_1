package by.bsuir.kugach.wt_laba_1.program.task_8;

import by.bsuir.kugach.wt_laba_1.program.interfaces.ITask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_8 implements ITask {
    int count_1;
    int count_2;
    double [] numbers_1;
    double [] numbers_2;

    private List<Integer> get_index_to_insert_items(double[] numbers_1, double[] numbers_2){
        List<Integer> result = new ArrayList<>();
        for (double number:
             numbers_2) {
            int i = 0;
            while(i < numbers_1.length){
                if(number < numbers_1[i]){
                    result.add(i);
                    break;
                }
                i++;
            }
            if(i == numbers_1.length){
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of items in first set: ");
        this.count_1 = in.nextInt();
        this.numbers_1 = new double[this.count_1];
        for(int i = 0; i < this.numbers_1.length; i++){
            System.out.println("Enter number: ");
            this.numbers_1[i] = in.nextDouble();
        }
        System.out.println("Enter count of items in second set: ");
        this.count_2 = in.nextInt();
        this.numbers_2 = new double[this.count_2];
        for(int i = 0; i < this.numbers_2.length; i++){
            System.out.println("Enter number: ");
            this.numbers_2[i] = in.nextDouble();
        }
    }

    @Override
    public void SolveTask() {
        List<Integer> Answer = get_index_to_insert_items(this.numbers_1, this.numbers_2);
        for (int index:
             Answer) {
            System.out.printf("%d   ",index);
        }
        System.out.println();
    }
}
