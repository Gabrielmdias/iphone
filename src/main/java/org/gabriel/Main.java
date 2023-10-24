package org.gabriel;

import org.gabriel.phone.Iphone;
import org.gabriel.phone.browser.Safari;
import org.gabriel.phone.media.Audio;
import org.gabriel.phone.media.MediaPlayer;
import org.gabriel.phone.media.Video;
import org.gabriel.phone.phone.CellPhone;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio("Alok");

        MediaPlayer mediaPlayer = new MediaPlayer(audio);
        Safari safari = new Safari();
        CellPhone cellPhone = new CellPhone();

        // Play music
        Iphone iphone = new Iphone(mediaPlayer, safari, cellPhone);
        iphone.getMediaPlayer().getMedia().play();
        iphone.getMediaPlayer().getMedia().pause();

        // Change media player to movie
        Video movie = new Video("Spider Man");
        mediaPlayer.setMedia(movie);

        iphone.getMediaPlayer().getMedia().mediaSelect();
        iphone.getMediaPlayer().getMedia().play();

        // Google access url on safari
        iphone.getBrowser().displayPage("www.google.com");
        iphone.getBrowser().updatePage();
        iphone.getBrowser().newTab();

        // Phone
        iphone.getPhone().call("9999-9999");
        iphone.getPhone().startVoicemail();
    }
}