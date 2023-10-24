package org.gabriel.phone.media;

public class Video extends Media {

    public Video(String mediaName) {
        super(mediaName);
    }

    @Override
    public void play() {
        System.out.println("Play video " + mediaName);
    }

    @Override
    public void mediaSelect() {
        System.out.printf("Video %s selected%n", mediaName);
    }
}
