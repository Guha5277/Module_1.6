package guhar4k.patterns.builder;

public class RockConcertBuilder extends ConcertBuilder {

    @Override
    void buildName() {
        concert.setArtist("Five Finger Death Punch");
    }

    @Override
    void buildHallSize() {
        concert.setHallSize(5000);
    }

    @Override
    void buildAgeLimit() {
        concert.setAgeLimit(18);
    }
}
