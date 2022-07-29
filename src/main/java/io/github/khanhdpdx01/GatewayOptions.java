package io.github.khanhdpdx01;

import org.hyperledger.fabric.gateway.Gateway;
import org.hyperledger.fabric.gateway.Wallet;

import java.io.IOException;

public class GatewayOptions {
    private final Wallet wallet;

    private final String identity;

    private final boolean enableDiscovery;

    public GatewayOptions(Wallet wallet, String identity, boolean enableDiscovery) {
        this.wallet = wallet;
        this.identity = identity;
        this.enableDiscovery = enableDiscovery;
    }

    public org.hyperledger.fabric.gateway.Gateway.Builder createGatewayBuilder() throws IOException {
        org.hyperledger.fabric.gateway.Gateway.Builder builder = Gateway.createBuilder();

        builder.identity(wallet, identity).discovery(enableDiscovery);

        return builder;
    }
}
