package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(){
        return "Playing: " + classicalMusic.getSong();

    }

}
