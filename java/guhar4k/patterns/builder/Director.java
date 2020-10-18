package guhar4k.patterns.builder;

public class Director {
    ConcertBuilder builder;

    public Director(ConcertBuilder builder) {
        this.builder = builder;
    }

    public Concert buildConcert(){
        builder.buildConcert();
        builder.buildName();
        builder.buildHallSize();
        builder.buildAgeLimit();
        return builder.getConcert();
    }
}
