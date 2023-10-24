package org.gabriel.phone;

import org.gabriel.phone.browser.Browser;
import org.gabriel.phone.media.MediaPlayer;
import org.gabriel.phone.phone.Phone;

public class Iphone {

    private MediaPlayer mediaPlayer;
    private Browser browser;
    private Phone phone;

    public Iphone(MediaPlayer mediaPlayer, Browser browser, Phone phone) {
        this.mediaPlayer = mediaPlayer;
        this.browser = browser;
        this.phone = phone;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
