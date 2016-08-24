package com.vinaysshenoy.pigeonpost;

/**
 * Created by vinaysshenoy on 24/08/16.
 */
public enum  SecurityProtocol {

    TLS("TLS"),
    SSL("SSL"),
    UNSECURED("UNSECURED");

    public final String code;

    SecurityProtocol(String code) {
        this.code = code;
    }
}
