package com.iunetworks;

public class Summarize {
       private static char[] findLongArray(char[] firstArray, char[] secondArray) {
        return firstArray.length > secondArray.length ? firstArray : secondArray;
    }
    private static char[] findSHortArray(char[] firstArray, char[] secondArray) {
        return firstArray.length < secondArray.length ? firstArray : secondArray;
    }

    public static char[] doSum(char[] firstArray, char[] secondArray) {
           char[] longArray =findLongArray(firstArray, secondArray);
           char[] shortArray=findSHortArray(firstArray,secondArray);
           char[] result = new char[longArray.length + 1];

        for (int i = longArray.length; i >= 0; --i) {
            result[i] = '0';
        }
        for (int i = 1; i < shortArray.length + 1; i++) {
            result[result.length - i] = (char) (result[result.length - i] + (char) (shortArray[shortArray.length - i] + longArray[longArray.length - i] - 2 * '0'));
            if (result[result.length - i] > '9') {
                result[result.length - i] = (char) (result[result.length - i] - 10);
                result[result.length - i - 1] = (char) ((char) result[result.length - i - 1] + 1);
            }
        }

        for (int i = shortArray.length + 1; i < longArray.length + 1; i++) {
            result[result.length - i] = (char) (result[result.length - i] + longArray[longArray.length - i] - '0');
            if (result[result.length - i] > '9') {
                result[result.length - i] = (char) (result[result.length - i] - 10);
                result[result.length - i - 1] = (char) ((char) result[result.length - i - 1] + 1);
            }
        }
        return result;

        }

    }

