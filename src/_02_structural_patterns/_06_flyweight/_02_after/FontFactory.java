package _02_structural_patterns._06_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if(cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newfont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newfont);
            return newfont;
        }

    }
}
