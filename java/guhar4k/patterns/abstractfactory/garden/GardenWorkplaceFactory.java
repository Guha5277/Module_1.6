package guhar4k.patterns.abstractfactory.garden;

import guhar4k.patterns.abstractfactory.WorkTool;
import guhar4k.patterns.abstractfactory.Worker;
import guhar4k.patterns.abstractfactory.Workplace;
import guhar4k.patterns.abstractfactory.WorkplaceFactory;

public class GardenWorkplaceFactory implements WorkplaceFactory {
    @Override
    public Workplace getWorkplace() {
        return new Garden();
    }

    @Override
    public Worker getWorker() {
        return new Gardener();
    }

    @Override
    public WorkTool getWorkTool() {
        return new Secateurs();
    }
}
