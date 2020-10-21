package guhar4k.patterns.creational.builder;

public class ConcertRunner {
    public static void main(String[] args) {
        Director rockConcertDirector = new Director(new RockConcertBuilder());
        Director classicConcertDirector = new Director(new ClassicConcertBuilder());

        Concert rockConcert = rockConcertDirector.buildConcert();
        Concert classicConcert = classicConcertDirector.buildConcert();
        System.out.println(rockConcert);
        System.out.println(classicConcert);
    }
}
