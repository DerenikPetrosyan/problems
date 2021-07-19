package com.iunetworks.StringMix;

public class ActionString {
    private static char[] oneSpaceText(char[] textCHar) {
        char[] oneSpace = new char[textCHar.length];
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ' && textCHar[i + 1] == ' ') {
                textCHar[i] = 0;
            }
            oneSpace[i] = textCHar[i];
        }

        return oneSpace;
    }


    private static char[] stringCHarArrays(String text) {
        char[] textCHar = new char[text.length()];
        for (int i = 0; i < textCHar.length; i++) {
            textCHar[i] = text.charAt(i);
        }
        return textCHar;
    }

    private static char[][] lenghtTextWord(String text) {
        char[] textCHar = oneSpaceText(stringCHarArrays(text));
        int count = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                count++;
            }
        }
        int[] lenghtWord = new int[count + 1];
        int value = 0;
        int letter = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] != 0 && textCHar[i] != ' ') {
                value++;
            }
            if (textCHar[i] == ' ') {
                lenghtWord[letter] = value;
                value = 0;
                letter++;
            }

        }
        lenghtWord[lenghtWord.length - 1] = value;
        char[][] wordCHar = new char[lenghtWord.length][];
        for (int i = 0; i < lenghtWord.length; i++) {
            wordCHar[i] = new char[lenghtWord[i]];
        }
        int n = 0;
        int m = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == ' ') {
                n++;
            }
            if (textCHar[i] == ' ' || textCHar[i] == 0) {
                m = 0;
                continue;
            }
            wordCHar[n][m] = textCHar[i];
            m++;

        }
        return wordCHar;
    }

    private static char[][] fileExtension(String text) {
        char[] textCHar = stringCHarArrays(text);
        int count = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == '\\') {
                count++;
            }
        }
        int[] lenghtWord = new int[count + 2];
        int value = 0;
        int letter = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] != '\\' && textCHar[i] != '.') {
                value++;
            }
            if (textCHar[i] == '\\' || textCHar[i] == '.') {
                lenghtWord[letter] = value;
                value = 0;
                letter++;
            }

        }
        lenghtWord[lenghtWord.length - 1] = value;
        char[][] wordCHar = new char[lenghtWord.length][];
        for (int i = 0; i < lenghtWord.length; i++) {
            wordCHar[i] = new char[lenghtWord[i]];
        }
        int n = 0;
        int m = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == '\\'|| textCHar[i] == '.') {
                n++;
            }
            if (textCHar[i] == '\\' || textCHar[i] == '.') {
                m = 0;
                continue;
            }
            wordCHar[n][m] = textCHar[i];
            m++;

        }
        return wordCHar;


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

    public static int containB(String text) {
        char[] textCHar = stringCHarArrays(text);
        int count = 0;
        int value = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == 'B') {
                count++;
            }
            if (textCHar[i] == ' ') {
                if (count > 0) {
                    value++;
                }
                count = 0;
            }
        }
        if (count > 0) {
            value++;
        }
        return value;
    }

    public static int containTwoB(String text) {
        char[] textCHar = stringCHarArrays(text);
        int count = 0;
        int value = 0;
        for (int i = 0; i < textCHar.length; i++) {
            if (textCHar[i] == 'B') {
                count++;
            }
            if (textCHar[i] == ' ') {
                if (count == 2) {
                    value++;
                }
                count = 0;
            }
        }
        if (count == 2) {
            value++;
        }
        return value;
    }

    public static char[] shortWord(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        int value = wordCHar[0].length;
        for (int i = 1; i < wordCHar.length; i++) {
            if (wordCHar[i].length < value) {
                value = wordCHar[i].length;
                count = i;
            }
        }
        return wordCHar[count];
    }

    public static char[] longWord(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        int value = wordCHar[0].length;
        for (int i = 1; i < wordCHar.length; i++) {
            if (wordCHar[i].length > value) {
                value = wordCHar[i].length;
                count = i;
            }
        }
        return wordCHar[count];
    }

    public static char[] pointDivorced(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            for (int j = 0; j < wordCHar[i].length; j++) {
                count++;
            }
        }
        char[] pointSpace = new char[count + wordCHar.length - 1];
        int value = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            if (value > 1 && value < pointSpace.length - 1) {
                pointSpace[value] = '.';
                value++;
            }
            for (int j = 0; j < wordCHar[i].length; j++) {
                pointSpace[value] = wordCHar[i][j];
                value++;
            }
        }
        return pointSpace;
    }

    public static char[] equalFirstLetter(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            for (int j = 0; j < wordCHar[i].length; j++) {
                count++;
            }
        }
        char[] pointSpace = new char[count + wordCHar.length - 1];
        int value = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            if (value > 1 && value < pointSpace.length - 1) {
                pointSpace[value] = ' ';
                value++;
            }
            for (int j = 0; j < wordCHar[i].length; j++) {
                pointSpace[value] = wordCHar[i][j];
                if (j != 0) {
                    if (wordCHar[i][0] == wordCHar[i][j]) {
                        pointSpace[value] = '.';
                    }
                }
                value++;
            }
        }
        return pointSpace;
    }

    public static char[] equalEndLetter(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            for (int j = 0; j < wordCHar[i].length; j++) {
                count++;
            }
        }
        char[] pointSpace = new char[count + wordCHar.length - 1];
        int value = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            if (value > 1 && value < pointSpace.length - 1) {
                pointSpace[value] = ' ';
                value++;
            }
            for (int j = 0; j < wordCHar[i].length; j++) {
                pointSpace[value] = wordCHar[i][j];
                if (j < wordCHar[i].length - 1) {
                    if (wordCHar[i][wordCHar[i].length - 1] == wordCHar[i][j]) {
                        pointSpace[value] = '.';
                    }
                }
                value++;
            }
        }
        return pointSpace;
    }

    public static char[] reversText(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            for (int j = 0; j < wordCHar[i].length; j++) {
                count++;
            }
        }
        char[] pointSpace = new char[count + wordCHar.length - 1];
        int value = 0;
        for (int i = wordCHar.length - 1; i >= 0; i--) {
            if (value > 1 && value < pointSpace.length - 2) {
                pointSpace[value] = ' ';
                value++;
            }
            for (int j = 0; j < wordCHar[i].length; j++) {
                pointSpace[value] = wordCHar[i][j];
                value++;
            }
        }
        return pointSpace;
    }

    public static char[] sortWordFirstFontText(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            for (int j = 0; j < wordCHar[i].length; j++) {
                count++;
            }
        }
        char[] pointSpace = new char[count + wordCHar.length - 1];
        int value = 0;
        for (int i = 0; i < wordCHar.length - 1; i++) {
            for (int j = 0; j < wordCHar.length - i - 1; j++) {
                if (wordCHar[j][0] > wordCHar[j + 1][0]) {
                    char[] velue = wordCHar[j];
                    wordCHar[j] = wordCHar[j + 1];
                    wordCHar[j + 1] = velue;
                }
            }
        }
        int value2 = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            if (value2 > 1 && value2 < pointSpace.length - 1) {
                pointSpace[value2] = ' ';
                value2++;
            }
            for (int j = 0; j < wordCHar[i].length; j++) {
                pointSpace[value2] = wordCHar[i][j];
                value2++;
            }
        }
        return pointSpace;
    }

    public static char[] startsWithCapitalLetter(String text) {
        char[][] wordCHar = lenghtTextWord(text);
        int count = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            for (int j = 0; j < wordCHar[i].length; j++) {
                count++;
            }
        }
        char[] pointSpace = new char[count + wordCHar.length - 1];
        int value = 0;
        for (int i = 0; i < wordCHar.length; i++) {
            if (value > 1 && value < pointSpace.length - 1) {
                pointSpace[value] = ' ';
                value++;
            }
            for (int j = 0; j < wordCHar[i].length; j++) {
                pointSpace[value] = wordCHar[i][j];
                if (j == 0) {
                    pointSpace[value] = (char) (wordCHar[i][j] - 32);
                }
                value++;
            }
        }
        return pointSpace;
    }

  public static char[] fileName(String text){
        char[] fileName=fileExtension(text)[fileExtension(text).length-2];
        return fileName;
  }


}
