package com.vinaysshenoy.pigeonpost.smtp;

import com.vinaysshenoy.pigeonpost.SecurityProtocol;

/**
 * Created by vinaysshenoy on 24/08/16.
 */
public class SmtpConfig {

    public final String server;

    public final int port;

    public final SecurityProtocol securityProtocol;

    private SmtpConfig(String server, int port, SecurityProtocol securityProtocol) {
        this.server = server;
        this.port = port;
        this.securityProtocol = securityProtocol;
    }

    /**
     * Creates an {@link SmtpConfig} instance for a server and a port
     * with TLS security protocol
     *
     * @param server the SMTP mail server
     * @param port   The SMTP port
     */
    public static SmtpConfig tls(String server, int port) {
        return new SmtpConfig(server, port, SecurityProtocol.TLS);
    }

    /**
     * Creates an {@link SmtpConfig} instance for a server and the
     * default SMTP TLS port({@code 587}) with TLS security protocol
     *
     * @param server The SMTP mail server
     */
    public static SmtpConfig tls(String server) {
        return tls(server, 587);
    }

    /**
     * Creates an {@link SmtpConfig} instance for a server and a port
     * with SSL security protocol
     *
     * @param server the SMTP mail server
     * @param port   The SMTP port
     */
    public static SmtpConfig ssl(String server, int port) {
        return new SmtpConfig(server, port, SecurityProtocol.SSL);
    }

    /**
     * Creates an {@link SmtpConfig} instance for a server and the
     * default SMTP SSL port({@code 465}) with SSL security protocol
     *
     * @param server The SMTP mail server
     */
    public static SmtpConfig ssl(String server) {
        return ssl(server, 465);
    }

    /**
     * Creates an {@link SmtpConfig} instance for a server and a port
     * with no security protocol
     *
     * @param server the SMTP mail server
     * @param port   The SMTP port
     */
    public static SmtpConfig unsecure(String server, int port) {
        return new SmtpConfig(server, port, SecurityProtocol.UNSECURED);
    }

    /**
     * Creates an {@link SmtpConfig} instance for a server and the
     * default SMTP port({@code 25}) with no security protocol
     *
     * @param server The SMTP mail server
     */
    public static SmtpConfig unsecure(String server) {
        return unsecure(server, 25);
    }

}
