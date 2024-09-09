package org.newfische.recapproject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

//        musicPlayer.play();
//        videoPlayer.play();

//        Playable[] playableArray = new Playable[2];
//        playableArray[0] =musicPlayer;
//        playableArray[1] = videoPlayer;

//        MediaController.playMedia(playableArray);

//        Using ArrayList
        ArrayList<Playable> playableArrayList = new ArrayList<>();
        playableArrayList.add(musicPlayer);
        playableArrayList.add(videoPlayer);



        MediaController.playMedia(playableArrayList);
    }
}