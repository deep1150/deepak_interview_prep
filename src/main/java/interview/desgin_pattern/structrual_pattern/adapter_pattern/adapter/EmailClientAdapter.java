package deepak_lld_prep.structrual_pattern.adapter_pattern.adapter;

import deepak_lld_prep.structrual_pattern.adapter_pattern.adaptee.LegacyEmailServer;
import deepak_lld_prep.structrual_pattern.adapter_pattern.target.ModernEmailClient;

public class EmailClientAdapter implements ModernEmailClient {
    private LegacyEmailServer legacyEmailServer;

    public EmailClientAdapter(LegacyEmailServer legacyEmailServer) {
        this.legacyEmailServer = legacyEmailServer;
    }

    @Override
    public void sendEmail(String recipient, String message) {
        legacyEmailServer.sendEmailMessage(recipient, message);
    }
}

