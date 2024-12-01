package deepak_lld_prep.structrual_pattern.facade_pattern.facade;

import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.DVDPlayer;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.Lights;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.Projector;
import deepak_lld_prep.structrual_pattern.facade_pattern.subsystem.SoundSystem;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(20);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}
