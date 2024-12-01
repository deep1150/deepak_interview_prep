package deepak_lld_prep.structrual_pattern.facade_pattern.subsystem;

// Subsystem 2: Projector
public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}