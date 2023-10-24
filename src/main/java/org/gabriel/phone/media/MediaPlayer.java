package org.gabriel.phone.media;

public class MediaPlayer {

    private Media media;

    public MediaPlayer(Media media) {
        this.media = media;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}
