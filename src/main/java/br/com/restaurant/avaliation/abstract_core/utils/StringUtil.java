package br.com.restaurant.avaliation.abstract_core.utils;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.List;
import java.util.regex.Pattern;

public class StringUtil {
    public static Boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static String unaccent(String string) {
        String temp = Normalizer.normalize(string, Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }

    public static String removeSpecialCharacters(String string) {
        string = Normalizer.normalize(string, Form.NFD);
        return string.replaceAll("[^\\p{ASCII}]", "");
    }

    public static void addPunctuationCharacter(List<?> entityList, StringBuilder string, int index) {
        if (index == entityList.size() - 2) {
            string.append(" e ");
        } else if (index != entityList.size() - 1) {
            string.append(", ");
        }

    }
}
