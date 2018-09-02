import java.util.ArrayList;
import java.util.List;

public class Worker {
    int counter=0;
    private Thread Worker;
    List<Task> taskList = new ArrayList<Task>(10);

    void equeueTask(String taskName) {
        Task task;
        task = new Task() {
            @Override
            public void run(int taskNumber) throws InterruptedException {
                System.out.println("Running " + Worker.getName() + " " + taskName );

                try {
                    for (int i = 4; i > 0; i--) {
                        System.out.println("Thread: " + Worker.getName() + "  " + i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Thread " + Worker.getName() + " interrupted.");
                }
                System.out.println("Thread " + Worker.getName() + " exiting.");

            }


        };
        taskList.add(task);
        counter++;
    }


    void stop() {
    }

    //void setListener(WorkerListener){}
    boolean isStarted() {
        return Worker.isAlive();
    }

    boolean isWorking() {
        return Worker.isInterrupted();
    }

    public Worker(String workerName) {
        Worker = new Thread();
        Worker.setName("Worker" + workerName + "Thread");
        System.out.println("Created: " + Worker.getName());


    }

    public void run() {
        System.out.println("Running " + Worker.getName());

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + Worker.getName() + "  " + i);
                Thread.sleep(1000);


            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Worker.getName() + " interrupted.");
        }
        System.out.println("Thread " + Worker.getName() + " exiting.");
    }

    void start() {
        for(int a=0 ; a<taskList.size() ; a++) {
            if(a>=counter)
                break;
            try {
                taskList.get(a).run(1);
            } catch (InterruptedException e) {
                System.out.println("Thread " + Worker.getName() + " interrupted.");
            }

        }
    }
}