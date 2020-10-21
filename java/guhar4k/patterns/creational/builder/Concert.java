package guhar4k.patterns.creational.builder;

public class Concert {
    private String artist;
    private int hallSize;
    private int ageLimit;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setHallSize(int hallSize) {
        this.hallSize = hallSize;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public String toString() {
        return artist + " concert, hall size: " + hallSize + ", age limit: " + ageLimit;
    }
}
