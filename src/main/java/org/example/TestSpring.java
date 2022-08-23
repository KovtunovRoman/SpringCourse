package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
        RockMusic secondRockMusic = context.getBean("musicBean", RockMusic.class);

        System.out.println(secondRockMusic.getSong());
        System.out.println(rockMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        secondMusicPlayer.playMusic();

        secondMusicPlayer.setVolume(6);
        secondMusicPlayer.setName("My love song");

        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        context.close();
    }
}
