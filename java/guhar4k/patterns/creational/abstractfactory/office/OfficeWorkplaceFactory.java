package guhar4k.patterns.creational.abstractfactory.office;

import guhar4k.patterns.creational.abstractfactory.WorkTool;
import guhar4k.patterns.creational.abstractfactory.Worker;
import guhar4k.patterns.creational.abstractfactory.Workplace;
import guhar4k.patterns.creational.abstractfactory.WorkplaceFactory;

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
