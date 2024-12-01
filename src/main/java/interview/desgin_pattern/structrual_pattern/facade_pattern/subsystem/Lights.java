package deepak_lld_prep.structrual_pattern.facade_pattern.subsystem;

// Subsystem 4: Lights

public class Lights {
    public void dim(int level) {
        System.out.println("Lights dimmed to: " + level + "%");
    }

    public void on() {
        System.out.println("Lights are ON");
    }
}
