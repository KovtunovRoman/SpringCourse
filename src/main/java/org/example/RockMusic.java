package org.example;

public class RockMusic implements Music{

    private RockMusic(){}

    public static RockMusic getRockMusicObject(){
        return new RockMusic();
    }
    public void doMyInit(){
        System.out.println("Initialization is starting");
    }

    public void doMyDestroy(){
        System.out.println("Destroy bean");
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }
}
