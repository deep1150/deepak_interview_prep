package deepak_lld_prep.structrual_pattern.flyweight_pattern.client;

import deepak_lld_prep.structrual_pattern.flyweight_pattern.factory.TextFormatFactory;
import deepak_lld_prep.structrual_pattern.flyweight_pattern.flyweight.TextFormat;

public class FlyweightExample {
    public static void main(String[] args) {
        TextFormatFactory formatFactory = new TextFormatFactory();

        // Create and reuse flyweights
        TextFormat format1 = formatFactory.getFormat("Arial", 12);
        TextFormat format2 = formatFactory.getFormat("Arial", 12);
        TextFormat format3 = formatFactory.getFormat("Times New Roman", 14);

        // Display characters using the flyweights
        format1.display(10, 20, "A");
        format2.display(15, 25, "B");
        format3.display(30, 40, "C");

        // Check if format1 and format2 share the same instance
        System.out.println("format1 and format2 are the same instance: " + (format1 == format2));
    }
}
