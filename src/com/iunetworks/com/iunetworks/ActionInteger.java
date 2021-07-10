package com.iunetworks;

import java.util.Arrays;

public class ActionInteger {
    public static void sumInteger(char[] X, char[] Y) {
        char[] Z;
        if (X.length < Y.length) {
            Z = new char[Y.length + 1];
            for (int i = 0; i < Z.length; i++) {
                Z[i] = '0';
            }
            for (int i = 1; i < X.length + 1; i++) {
                Z[Z.length - i] = (char) (Z[Z.length - i] + (char) (X[X.length - i] + Y[Y.length - i] - 2*'0'));
                if (Z[Z.length - i] > '9') {
                    Z[Z.length - i] = (char) (Z[Z.length - i] - 10);
                    Z[Z.length - i - 1] = (char) ((char) Z[Z.length - i - 1] + 1);
                }
            }
            for (int i = X.length + 1; i < Y.length + 1; i++) {
                Z[Z.length - i] = (char) (Z[Z.length - i] + Y[Y.length - i] - '0');
                if (Z[Z.length - i] > '9') {
                    Z[Z.length - i] = (char) (Z[Z.length - i] - 10);
                    Z[Z.length - i - 1] = (char) ((char) Z[Z.length - i - 1] + 1);
                }
            }
        } else {
            Z = new char[X.length + 1];
            for (int i = 0; i < Z.length; i++) {
                Z[i] = '0';
            }
            for (int i = 1; i < Y.length + 1; i++) {
                Z[Z.length - i] = (char) (Z[Z.length - i] + (char) (Y[Y.length - i] + X[X.length - i] - 96));
                if (Z[Z.length - i] > 57) {
                    Z[Z.length - i] = (char) (Z[Z.length - i] - 10);
                    Z[Z.length - i - 1] = (char) ((char) Z[Z.length - i - 1] + 1);
                }
            }
            for (int i = Y.length + 1; i < X.length + 1; i++) {
                Z[Z.length - i] = (char) (Z[Z.length - i] + X[X.length - i] - 48);
                if (Z[Z.length - i] > 57) {
                    Z[Z.length - i] = (char) (Z[Z.length - i] - 10);
                    Z[Z.length - i - 1] = (char) ((char) Z[Z.length - i - 1] + 1);
                }
            }
        }

        System.out.println(Arrays.toString(Z));
    }
}

