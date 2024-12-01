package deepak_lld_prep.structrual_pattern.facade_pattern.client;

// Client Code

import deepak_lld_prep.structrual_pattern.facade_pattern.facade.HomeTheaterFacade;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.DVDPlayer;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.Lights;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.Projector;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.SoundSystem;

public class FacadeExample {
    public static void main(String[] args) {
        // Create instances of the subsystems
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        // Create the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

        // Use the Facade to start and stop movie
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
