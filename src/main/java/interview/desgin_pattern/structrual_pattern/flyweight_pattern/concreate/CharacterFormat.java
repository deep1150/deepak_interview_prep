package deepak_lld_prep.structrual_pattern.flyweight_pattern.concreate;

import deepak_lld_prep.structrual_pattern.flyweight_pattern.flyweight.TextFormat;

public class CharacterFormat implements TextFormat {
    private String font;
    private int size;

    public CharacterFormat(String font, int size) {
        this.font = font;
        this.size = size;
    }

    @Override
    public void display(int x, int y, String character) {
        System.out.println("Character: " + character + " [Font: " + font + ", Size: " + size + "] at (" + x + ", " + y + ")");
    }
}
