package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        if (name.isEmpty()) {
            result = false;
        } else if (!isLowerLatinLetter(name.codePointAt(0))) {
            result = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if ((!isSpecialSymbol(code) && isUpperLatinLetter(code) && isLowerLatinLetter(code) && isDigit(code))) {
                    result = false;
                    break;
                }
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

