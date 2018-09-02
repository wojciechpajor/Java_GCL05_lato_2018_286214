import java.util.List;

public class main {
    public static void main(String[] args) {
        Task task;
        System.out.println("Hello");
        Worker worker = new Worker("Pracownik");
        worker.equeueTask("task_1");
        worker.equeueTask("task_2");
        worker.start();

    }


}
