package deepak_lld_prep.structrual_pattern.adapter_pattern.adaptee;

public class LegacyEmailServer {
    public void sendEmailMessage(String recipient, String body) {
        System.out.println("Sending email to " + recipient + " with body: " + body);
    }
}
