package deepak_lld_prep.structrual_pattern.proxy_pattern.proxy;

import deepak_lld_prep.structrual_pattern.proxy_pattern.subject.Image;
import deepak_lld_prep.structrual_pattern.proxy_pattern.real.RealImage;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}