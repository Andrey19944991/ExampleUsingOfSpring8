package ru.chekovandrey;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationcontext.xml");

        Music music1 =context.getBean("classicalMusicBean",Music.class);

        MusicPlayer musicPlayer=new MusicPlayer(music1);
        musicPlayer.playMusic();

        Music music2= context.getBean("rockMusicBean",Music.class);
        MusicPlayer otherMusicPlayer=new MusicPlayer(music2);
        otherMusicPlayer.playMusic();

        context.close(); //в конце закрываем
    }
}
