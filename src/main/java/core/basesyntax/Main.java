package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileWork a = new FileWork();
        System.out.println(Arrays.toString(a.readFromFile("test3")));
    }
}