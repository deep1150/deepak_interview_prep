package deepak_lld_prep.creational_pattern.prototype.client;

import deepak_lld_prep.creational_pattern.prototype.module.Document;

public class PrototypeExample {
    public static void main(String[] args) {
        // Create an original document
        Document originalDoc = new Document("Original Content");
        System.out.println("Original Document: " + originalDoc);

        // Clone the original document
        Document clonedDoc = (Document) originalDoc.clone();
        clonedDoc.setContent("Cloned Content");

        // Display both documents
        System.out.println("Cloned Document: " + clonedDoc);
    }
}

