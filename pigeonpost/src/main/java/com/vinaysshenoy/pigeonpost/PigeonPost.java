package com.vinaysshenoy.pigeonpost;

public final class PigeonPost {

    private PigeonPost() {

    }

    public static Carrier newCarrier(String email, String login, String password) {
        return Carrier.create(email, login, password);
    }
}
