package guhar4k.patterns.abstractfactory;

import guhar4k.patterns.abstractfactory.garden.GardenWorkplaceFactory;
import guhar4k.patterns.abstractfactory.office.OfficeWorkplaceFactory;

public class WorkLauncher {
    public static void main(String[] args) {
        WorkplaceFactory workplaceFactory = new GardenWorkplaceFactory();
//        WorkplaceFactory workplaceFactory = new OfficeWorkplaceFactory();
        Workplace workplace = workplaceFactory.getWorkplace();
        Worker worker = workplaceFactory.getWorker();
        WorkTool workTool = workplaceFactory.getWorkTool();

        workplace.checkWorkplace();
        workTool.checkWorkTool();
        worker.work();
    }
}
