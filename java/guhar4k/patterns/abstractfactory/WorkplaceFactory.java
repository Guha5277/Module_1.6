package guhar4k.patterns.abstractfactory;

public interface WorkplaceFactory {
    public Workplace getWorkplace();
    public Worker getWorker();
    public WorkTool getWorkTool();
}
