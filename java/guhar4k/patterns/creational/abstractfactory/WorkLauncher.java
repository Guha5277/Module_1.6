package guhar4k.patterns.creational.abstractfactory;

import guhar4k.patterns.creational.abstractfactory.garden.GardenWorkplaceFactory;

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
