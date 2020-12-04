package Module10;

import java.util.ArrayDeque;
import java.util.Queue;

public class Worker {
    private ArrayDeque toDoQueue; // у рабочего есть ссылка на очередь из заданий
    public Worker(ArrayDeque toDoQueue) {
        this.toDoQueue = toDoQueue; // даем ссылку на очередь в конструкторе
    }
    public void takeTask() {
        Object task = toDoQueue.pollLast(); // вынимаем задание из очереди
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}