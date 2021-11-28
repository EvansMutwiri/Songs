package com.evans.songs.songsinfo;

import org.springframework.stereotype.Component;

@Component
public class DearMama implements Song{
    @Override
    public void songInfo() {
        System.out.println("A song by Makavelli");
    }
}
