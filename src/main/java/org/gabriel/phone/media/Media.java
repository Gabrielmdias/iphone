package org.gabriel.phone.media;

public abstract class Media {

    protected String mediaName;

    protected Media(String mediaName) {
        this.mediaName = mediaName;
    }

    public abstract void play();

    public abstract void mediaSelect();

    public void pause() {
        System.out.println("Pause!");
    }
}
