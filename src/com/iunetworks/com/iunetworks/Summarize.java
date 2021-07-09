package com.iunetworks;

public class Summarize {
    public static char[] doSummarize(char[] firstArray, char[] secondArray) {
        return firstArray.length > secondArray.length ?
                doSum(firstArray, secondArray) :
                doSum(secondArray, firstArray);
    }

    private static char[] findLongArray(char[] firstArray, char[] secondArray) {
        return firstArray.length > secondArray.length ? firstArray : secondArray;
    }

    private static char[] doSum(char[] mainArray, char[] secondArray) {
        char[] result = new char[findLongArray(mainArray, secondArray).length + 1];

        for (int i = mainArray.length - 1; i >= 0; --i) {

        }

        return result;
    }
}