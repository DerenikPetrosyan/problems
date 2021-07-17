package com.iunetworks.StringMix;

public class ActionString {
    private static char[] stringCHarArrays(String text) {
        char[] textCHar = new char[text.length()];
        for (int i = 0; i < textCHar.length; i++) {
            textCHar[i] = text.charAt(i);
        }
        return textCHar;
    }

    public static char[] printMatrix(char[] matrix) {
        System.out.print("[ ");
        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i]);
            if (i < matrix.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" ]");
        return matrix;
    }

    public static int countText(String firstText, String secondText) {
        int count = 0;
        char[] firstCHar = stringCHarArrays(firstText);
        char[] secoundCHar = stringCHarArrays(secondText);
        for (int i = 0; i < firstCHar.length - secoundCHar.length + 1; i++) {
            if (firstCHar[i] == secoundCHar[0]) {
                int value = 0;
                for (int j = 1; j < secondText.length(); j++) {
                    if (firstCHar[i + j] == secoundCHar[j]) {
                        value++;
                    }
                    if (value == secoundCHar.length - 1) {
                        count++;
                    }
                }

            }
        }
        return count;
    }

    public static int indexLastSecoundText(String firstText, String secondText) {
        int count = 0;
        char[] firstCHar = stringCHarArrays(firstText);
        char[] secoundCHar = stringCHarArrays(secondText);
        for (int i = 0; i < firstCHar.length - secoundCHar.length + 1; i++) {
            if (firstCHar[i] == secoundCHar[0]) {
                for (int j = 1; j < secondText.length(); j++) {
                    if (firstCHar[i + j] == secoundCHar[j]) {
                        count = i;
                    }
                }
            }
        }
        return count;
    }

    public static char[] spaceBetweenText(String text) {
        char[] textCHar = stringCHarArrays(text);
        int firstSpaceIndex = 0;
        int secoundSpaseIndex = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                firstSpaceIndex = i;
                break;
            }
        }
        int secoundSpase = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                secoundSpaseIndex = i;
                secoundSpase++;
                if (secoundSpase == 2) {
                    break;
                }
            }
        }
        char[] betweenSpace = new char[secoundSpaseIndex - firstSpaceIndex - 1];

        for (int i = 0; i < betweenSpace.length; i++) {
            betweenSpace[i] = textCHar[firstSpaceIndex + i + 1];
        }
        return betweenSpace;
    }

    public static char[] spaceText(String text) {
        char[] textCHar = stringCHarArrays(text);
        int firstSpaceIndex = 0;
        int endSpaseIndex = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                firstSpaceIndex = i;
                break;
            }
        }

        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                endSpaseIndex = i;

            }
        }
        char[] betweenSpace = new char[endSpaseIndex - firstSpaceIndex - 1];

        for (int i = 0; i < betweenSpace.length; i++) {
            betweenSpace[i] = textCHar[firstSpaceIndex + i + 1];
        }
        return betweenSpace;
    }

    public static int wordText(String text) {
        char[] textCHar = stringCHarArrays(text);
        int count = 1;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int sameNameCount(String text) {
        char[] textCHar = stringCHarArrays(text);
        int count = wordText(text);
        char[] firstLetter = new char[count];
        firstLetter[0] = textCHar[0];
        int value = 1;
        for (int i = 1; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                firstLetter[value] = textCHar[i + 1];
                value++;
            }
        }
        char valu = 0;
        for (int i = 0; i < firstLetter.length; i++) {
            for (int j = 1; j < (firstLetter.length - i); j++) {
                if (firstLetter[j - 1] > firstLetter[j]) {
                    valu = firstLetter[j - 1];
                    firstLetter[j - 1] = firstLetter[j];
                    firstLetter[j] = valu;
                }
            }
        }
        for (int i = 1; i < firstLetter.length; i++) {
            if (firstLetter[i] == firstLetter[i - 1]) {
                firstLetter[i - 1] = 0;
            }
        }
        int countName = 0;
        for (int i = 0; i < firstLetter.length; i++) {
            if (firstLetter[i] == 0) {
                countName++;
            }
        }
        return countName;
    }


}
