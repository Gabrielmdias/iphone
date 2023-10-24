package org.gabriel.phone.browser;

public class Safari implements Browser {
    @Override
    public void displayPage(String url) {
        System.out.println("Safari display page " + url);
    }
}
