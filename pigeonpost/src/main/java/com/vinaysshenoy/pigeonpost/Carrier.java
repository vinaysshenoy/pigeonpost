package com.vinaysshenoy.pigeonpost;

import static com.vinaysshenoy.pigeonpost.util.TextUtils.isAtLeastOneEmpty;

/**
 * Created by vinaysshenoy on 24/08/16.
 */
public final class Carrier {

    private final String email;

    private final String login;

    private final String password;

    private Carrier(String email, String login, String password) {

        this.email = email;
        this.login = login;
        this.password = password;
    }

    /* package */
    static Carrier create(String email, String login, String password) {

        if (isAtLeastOneEmpty(email, login, password)) {
            throw new IllegalArgumentException("None of email, login or password can be empty");
        }
        return new Carrier(email, login, password);
    }
}
