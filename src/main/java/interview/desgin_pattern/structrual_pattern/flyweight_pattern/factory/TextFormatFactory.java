package deepak_lld_prep.structrual_pattern.flyweight_pattern.factory;

import deepak_lld_prep.structrual_pattern.flyweight_pattern.concreate.CharacterFormat;
import deepak_lld_prep.structrual_pattern.flyweight_pattern.flyweight.TextFormat;

import java.util.HashMap;
import java.util.Map;

public class TextFormatFactory {
    private Map<String, TextFormat> formatPool = new HashMap<>();

    public TextFormat getFormat(String font, int size) {
        String key = font + size;
        if (!formatPool.containsKey(key)) {
            formatPool.put(key, new CharacterFormat(font, size));
        }
        return formatPool.get(key);
    }
}