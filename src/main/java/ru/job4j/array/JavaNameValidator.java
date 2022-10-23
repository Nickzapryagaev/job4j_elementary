package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = name.length() > 0;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (i == 0 && !isLowerLatinLetter(code)) {
                result = false;
                break;
            } else if ((!isSpecialSymbol(code) && isUpperLatinLetter(code)
                    && isLowerLatinLetter(code) && isDigit(code))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}
