package com.evans.songs;

import com.evans.songs.songsinfo.AllEyezOnMe;
import com.evans.songs.songsinfo.Song;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SongsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SongsApplication.class, args);

        Song song = context.getBean(AllEyezOnMe.class);
        song.songInfo();
    }

}
