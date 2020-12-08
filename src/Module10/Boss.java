package Module10;

import java.util.ArrayDeque;
import java.util.Queue;

public class Boss {
    private ArrayDeque toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(ArrayDeque toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}