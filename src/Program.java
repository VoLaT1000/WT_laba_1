import by.bsuir.kugach.wt_laba_1.program.interfaces.ITask;
import by.bsuir.kugach.wt_laba_1.program.task_1.Task_1;
import by.bsuir.kugach.wt_laba_1.program.task_2.Task_2;
import by.bsuir.kugach.wt_laba_1.program.task_3.Task_3;
import by.bsuir.kugach.wt_laba_1.program.task_4.Task_4;
import by.bsuir.kugach.wt_laba_1.program.task_5.Task_5;
import by.bsuir.kugach.wt_laba_1.program.task_6.Task_6;
import by.bsuir.kugach.wt_laba_1.program.task_7.Task_7;
import by.bsuir.kugach.wt_laba_1.program.task_8.Task_8;
import by.bsuir.kugach.wt_laba_1.program.task_9.Task_9;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main (String args[]){
        List<ITask> tasks = new ArrayList<>();

        tasks.add(new Task_1());
        tasks.add(new Task_2());
        tasks.add(new Task_3());
        tasks.add(new Task_4());
        tasks.add(new Task_5());
        tasks.add(new Task_6());
        tasks.add(new Task_7());
        tasks.add(new Task_8());
        tasks.add(new Task_9());

        for (ITask task:
             tasks) {
            task.GetInput();
            task.SolveTask();
        }
    }
}
