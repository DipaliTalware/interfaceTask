package org.newfische.recapproject;

import java.util.ArrayList;

public class MediaController {
//    public static void playMedia(Playable[] playableArray){
//        playableArray[0].play();
//        playableArray[1].play();

        public static void playMedia(ArrayList<Playable> playableArray){
        playableArray.get(0).play();
        playableArray.get(1).play();


    }
}
