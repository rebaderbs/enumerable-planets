package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, 0, "Roman God of Speed"),
    VENUS("Venus", 225, 0, "Roman Goddess of Love"),
    EARTH("Earth", 365, 1, "The Ground"),
    MARS("Mars", 687, 2, "Roman God of War"),
    JUPITER("Jupiter", 4333, 79, "King of the Roman Gods"),
    SATURN("Saturn", 10759, 62, "Father of Jupiter"),
    URANUS("Uranus", 30687, 27, "Greek God of the Sky"),
    NEPTUNE("Neptune", 60200, 14, "Roman God of the Sea");

    private String name;
    private int yearLength;
    private int numberOfMoons;
    private String namesake;

    Planets(String name, int yearLength, int numberOfMoons, String namesake) {
        this.name = name;
        this.yearLength = yearLength;
        this.numberOfMoons = numberOfMoons;
        this.namesake = namesake;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public String getNamesake() {
        return namesake;
    }
}
