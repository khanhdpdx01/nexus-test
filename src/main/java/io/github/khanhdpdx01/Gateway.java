package io.github.khanhdpdx01;

import org.hyperledger.fabric.gateway.Network;

import java.io.IOException;
import java.nio.file.Path;

public class Gateway {
    private org.hyperledger.fabric.gateway.Gateway gateway;

    public void connect(Path cppPath, GatewayOptions options) throws IOException {
        org.hyperledger.fabric.gateway.Gateway.Builder builder = options.createGatewayBuilder();

        builder.networkConfig(cppPath);

        gateway = builder.connect();
    }

    public Network getNetwork(String networkName) {
        return gateway.getNetwork(networkName);
    }
}
