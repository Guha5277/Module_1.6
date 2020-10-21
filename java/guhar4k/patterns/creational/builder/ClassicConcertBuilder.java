package guhar4k.patterns.creational.builder;

public class ClassicConcertBuilder extends ConcertBuilder {
    @Override
    void buildName() {
        concert.setArtist("Ludovico Einaudi");
    }

    @Override
    void buildHallSize() {
        concert.setHallSize(3000);
    }

    @Override
    void buildAgeLimit() {
        concert.setAgeLimit(3);
    }
}
