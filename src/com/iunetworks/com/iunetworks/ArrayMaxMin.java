package com.iunetworks;

public class ArrayMaxMin {
    public ArrayMaxMin() {
    }

    public static void sumMaxMIn(int[] tver) {
        int k = 0;
        int sum = 0;

        for(int i = 0; i < tver.length; ++i) {
            for(int j = 1; j < tver.length - i; ++j) {
                if (tver[j - 1] > tver[j]) {
                    k = tver[j - 1];
                    tver[j - 1] = tver[j];
                    tver[j] = k;
                }
            }
        }

        sum = tver[0] + tver[tver.length - 1];
        System.out.println(sum);
    }

    public static void maxSumIndex(int[] tver) {
        int sum = 0;
        int k = 0;

        int i;
        for(i = 0; i < tver.length; ++i) {
            if (tver[i] > sum) {
                sum = tver[i];
            }
        }

        for(i = 0; i < tver.length; ++i) {
            if (tver[i] == sum) {
                k = i;
                break;
            }
        }

        i = sum + k;
        System.out.println(i);
    }
}
