package org.gabriel.phone.media;

public class Audio extends Media {

    public Audio(String mediaName) {
        super(mediaName);
    }

    @Override
    public void play() {
        System.out.println("Play audio " + mediaName);
    }

    @Override
    public void mediaSelect() {
        System.out.printf("Audio %s selected%n", mediaName);
    }
}
