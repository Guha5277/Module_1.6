package guhar4k.patterns.builder;

public abstract class ConcertBuilder {
    Concert concert;

    void buildConcert(){
        concert = new Concert();
    }

    abstract void buildName();
    abstract void buildHallSize();
    abstract void buildAgeLimit();

    public Concert getConcert() {
        return concert;
    }
}
