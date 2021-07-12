package com.iunetworks;

public class MultiplicationBigInteger {
    public static char[] doMultiplication(char[] firstArray, char[] secondArray) {
        char[] resalt = new char[firstArray.length+ secondArray.length];
        char[] shortArray=findSHortArray(firstArray,secondArray);
        char[] longArray=findLongArray(firstArray,secondArray);
        for (int i = 0; i < resalt.length; i++) {
            resalt[i]='0';
        }

        for (int i =0; i <longArray.length ;i++) {
            for (int j = 0; j <shortArray.length; j++) {
                    resalt[resalt.length-1-i-j]= (char) (resalt[resalt.length-1-i-j]+((longArray[longArray.length-1-i]-'0')*(secondArray[secondArray.length-1-j]-'0'))%10);
                    resalt[resalt.length-2-i-j]= (char) (resalt[resalt.length-2-i-j]+((int)((longArray[longArray.length-1-i]-'0')*(secondArray[secondArray.length-1-j]-'0'))/10));
            }
            }


        replaceCHarInteger(resalt);


        return resalt;
    }

    private static char[] findLongArray(char[] firstArray, char[] secondArray) {

        return firstArray.length >= secondArray.length ? firstArray : secondArray;
    }

    private static char[] findSHortArray(char[] firstArray, char[] secondArray) {
        return firstArray.length < secondArray.length ? firstArray : secondArray;
    }

    private static char[] replaceCHarInteger(char[] resalt){
        for (int i =1; i <resalt.length; i++) {
            if(resalt[resalt.length-i]>'9'){
                int balance=(resalt[resalt.length-i]-'0') % 10 ;
                int whole=(resalt[resalt.length-i]-'0')/10;
                resalt[resalt.length-i]= (char)(balance+'0');
                resalt[resalt.length-1-i]= (char) (resalt[resalt.length-1-i]+whole);
            }
        }
        return resalt;
    }

    }


