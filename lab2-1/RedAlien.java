class RedAlien {
    private final String name;
    private final int numberOfLimbs;

    public RedAlien(String name, int numberOfLimbs) {
        this.name = name;
        this.numberOfLimbs = numberOfLimbs;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    @Override
    public String toString() {
        return String.format("Red Alien %s, %d limbs", name, numberOfLimbs);
    }
}
