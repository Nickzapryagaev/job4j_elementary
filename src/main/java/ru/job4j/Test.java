package ru.job4j;

public class Test {
    @SuppressWarnings("checkstyle:MethodParamPad")
    public static void main(String[] args) {
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println(d);
    }
}
