package deepak_lld_prep.structrual_pattern.proxy_pattern.client;

import deepak_lld_prep.structrual_pattern.proxy_pattern.proxy.ProxyImage;
import deepak_lld_prep.structrual_pattern.proxy_pattern.subject.Image;

public class ProxyExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // The image will only be loaded from disk when display() is called
        image1.display();  // Output: Loading photo1.jpg from disk... Displaying photo1.jpg
        image1.display();  // Output: Displaying photo1.jpg (no reloading)
        image2.display();  // Output: Loading photo2.jpg from disk... Displaying photo2.jpg
    }
}

