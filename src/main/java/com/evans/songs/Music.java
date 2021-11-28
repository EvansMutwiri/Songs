package com.evans.songs;

import com.evans.songs.songsinfo.Song;
import org.springframework.beans.factory.annotation.Autowired;

public class Music {
    @Autowired
    Song song;

    public void showInfo() {
        song.songInfo();
    }

}
