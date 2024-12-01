package deepak_lld_prep.creational_pattern.builder.model;

public class House {
    private String walls;
    private String roof;
    private String windows;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House with " + walls + " walls, " + roof + " roof, and " + windows + " windows.";
    }
}
