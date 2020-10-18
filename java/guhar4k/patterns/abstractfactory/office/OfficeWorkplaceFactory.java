package guhar4k.patterns.abstractfactory.office;

import guhar4k.patterns.abstractfactory.WorkTool;
import guhar4k.patterns.abstractfactory.Worker;
import guhar4k.patterns.abstractfactory.Workplace;
import guhar4k.patterns.abstractfactory.WorkplaceFactory;

public class OfficeWorkplaceFactory implements WorkplaceFactory {
    @Override
    public Workplace getWorkplace() {
        return new Office();
    }

    @Override
    public Worker getWorker() {
        return new Manager();
    }

    @Override
    public WorkTool getWorkTool() {
        return new PersonalComputer();
    }
}
