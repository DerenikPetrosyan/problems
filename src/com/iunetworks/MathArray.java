package com.iunetworks;

public class MathArray {
    public static void drakanTveriMijinTvabanakan(int[] tver){
        int sum=0;
        int k=0;
        for (int j:tver){
            if (j>0){
                sum= sum+j;
                k++;
            }
        }
        int mij= sum/k;
        System.out.println(mij);
    }

    public static void bacasakanTveriMijinQarakusayin(int[] tver){
        int sum=0;
        int k=0;
        for (int j:tver){
            if (j<0){
                sum= sum+j*j;
                k++;
            }
        }
        int mij= sum/k;
        System.out.println(mij);

    }
    public static void zuygIndexGumar(int[]tver){
        int sum=0;
        for (int i = 0; i <tver.length ;i++) {
            if(i%2==0) {
                sum = sum + tver[i];
            }

        }
        System.out.println(sum);
    }


    public static void sumAbs(int[] tver){
        int sum=0;
        for (int i = 0; i <tver.length ;i++) {
            if(i%2!=0) {
                sum = sum +Math.abs(tver[i]);
            }

        }
        System.out.println(sum);

    }


    public static void tarqanak(int[]tver){
        int sum=0;
        int k=0;
        for (int j:tver){
            if (j<0){
                sum++;
            }
        }
        for (int j:tver){
            if (j>0){
                k++;
            }
        }

        System.out.println("Trvac zangvacumm drakan tveri qanak@ "+k);
        System.out.println("Trvac zangvacum bacasakan tveri qanak@ "+sum);

    }

    public static void sumMijakayq(int[]tver){
        int sum=0;

        int a= 4;
        int b= 7;
        for (int i = a; i <b+1 ; i++) sum = sum + tver[i];
        System.out.println(sum);
    }


}
