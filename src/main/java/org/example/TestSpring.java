package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



        Music music = context.getBean("rockMusicFirstBean", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        classicalMusicPlayer.playMusic();
        musicPlayer.playMusic();

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
