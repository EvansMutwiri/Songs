package com.evans.songs.songsinfo;

import org.springframework.stereotype.Component;

@Component
public class AllEyezOnMe implements Song{
    @Override
    public void songInfo() {
        System.out.println("This song is so soulful, Also the album is a no skip \nSo much trouble in the world, nigga\n" +
                "Can't nobody feel your pain\n" +
                "The world's changin' everyday, time's movin' fast\n" +
                "My girl said I need a raise, how long will she last?");
    }
}
