package by.bsuir.kugach.wt_laba_1.program.task_5;

import by.bsuir.kugach.wt_laba_1.program.interfaces.ITask;

import java.util.Scanner;

public class Task_5 implements ITask {
    private int count_of_items;
    private int[] numbers;
    private int count_of_deleted_items(int[] numbers){
        int result = 0;
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] > numbers[i-1]){
                i++;
            } else{
              int k = i;
              while(k < numbers.length && numbers[k] < numbers[i-1]){
                  k++;
              }
              result += k - i;
              i = k;
            }
        }
        return result;
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        this.count_of_items = in.nextInt();
        this.numbers = new int[this.count_of_items];
        for (int i = 0; i < this.numbers.length; i ++){
            System.out.println("Enter number: ");
            this.numbers[i] = in.nextInt();
        }
    }

    @Override
    public void SolveTask() {
        System.out.printf("Answer: %d", count_of_deleted_items(this.numbers));
        System.out.println();
    }
}
