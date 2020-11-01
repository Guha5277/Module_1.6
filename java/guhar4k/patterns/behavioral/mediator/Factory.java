package guhar4k.patterns.behavioral.mediator;
import java.util.ArrayList;
import java.util.List;

public class Factory {
    private Director director;
    private List<Worker> workers = new ArrayList<>();

    public void setDirector(Director director) {
        this.director = director;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void makeProduct(){
        director.manage();
        for (Worker w : workers){
            w.work();
        }

        System.out.println("The product was made!");
    }
}
