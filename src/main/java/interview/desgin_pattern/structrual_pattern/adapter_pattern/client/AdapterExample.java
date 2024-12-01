package deepak_lld_prep.structrual_pattern.adapter_pattern.client;

import deepak_lld_prep.structrual_pattern.adapter_pattern.adaptee.LegacyEmailServer;
import deepak_lld_prep.structrual_pattern.adapter_pattern.adapter.EmailClientAdapter;
import deepak_lld_prep.structrual_pattern.adapter_pattern.target.ModernEmailClient;


public class AdapterExample {
    public static void main(String[] args) {
        // Create an instance of the legacy email server
        LegacyEmailServer legacyEmailServer = new LegacyEmailServer();

        // Create an adapter for the legacy email server
        ModernEmailClient emailClient = new EmailClientAdapter(legacyEmailServer);

        // Use the target interface to send an email
        emailClient.sendEmail("example@example.com", "Hello, this is a test email!");
        // Output: Sending email to example@example.com with body: Hello, this is a test email!
    }
}