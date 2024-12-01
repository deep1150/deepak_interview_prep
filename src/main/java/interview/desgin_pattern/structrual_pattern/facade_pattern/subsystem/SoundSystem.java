package deepak_lld_prep.structrual_pattern.facade_pattern.subsystem;


// Subsystem 3: Sound System

public class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to: " + level);
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }
}