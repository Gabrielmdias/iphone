package org.gabriel.phone.browser;

public interface Browser {

    default void updatePage() {
        System.out.println("Update page");
    }

    default void newTab() {
        System.out.println("New tab");
    }

    void displayPage(String url);
}
