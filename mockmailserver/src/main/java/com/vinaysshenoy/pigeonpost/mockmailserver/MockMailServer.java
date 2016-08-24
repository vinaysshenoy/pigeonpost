package com.vinaysshenoy.pigeonpost.mockmailserver;

import com.icegreen.greenmail.util.GreenMail;

public class MockMailServer {

    private final GreenMail greenMail;

    public MockMailServer() {
        greenMail = new GreenMail();
    }

    public static void main(String[] args) {
        new MockMailServer().start();
    }

    private void start() {
        System.out.println("Starting Mock Mail Server!");

        greenMail.setUser("user1@localhost", "user1", "password1");
        greenMail.setUser("user2@localhost", "user2", "password2");
        greenMail.start();
    }
}
