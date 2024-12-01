package deepak_lld_prep.creational_pattern.prototype.module;

import deepak_lld_prep.creational_pattern.prototype.Prototype;

// ConcretePrototype
public class Document implements Prototype {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    // Getter and setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Prototype clone() {
        return new Document(this.content);
    }

    @Override
    public String toString() {
        return "Document with content: " + content;
    }
}

