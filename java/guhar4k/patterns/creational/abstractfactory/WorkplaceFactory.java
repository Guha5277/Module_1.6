package guhar4k.patterns.creational.abstractfactory;

public interface WorkplaceFactory {
    public Workplace getWorkplace();
    public Worker getWorker();
    public WorkTool getWorkTool();
}
