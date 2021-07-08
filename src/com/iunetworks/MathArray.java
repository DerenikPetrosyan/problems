package com.iunetworks;

import java.util.Scanner;

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
        double mij= sum/k;
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
        double mij= sum/k;
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


    public static void tarQanak(int[]tver){
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

    public static void sumMijkayq(int[]tver){
        int sum=0;

        int a= 4;
        int b= 7;
        for (int i = a; i <b+1 ; i++) sum = sum + tver[i];
        System.out.println(sum);
    }

    public static void poqrKicQanak(int[]tver){
        Scanner scanner=new Scanner(System.in);
        int k= scanner.nextInt();
        int sum=0;
        for (int j:tver){
            if(Math.abs(j)<k){
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void sumMijBazIndexK(int[]tver){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int x=0;
        int k= scanner.nextInt();
        for (int i = 1; i < tver.length; i++) {
            if(k%i==0){
                sum=sum+tver[i];
                x++;
            }
        }
        double mij=sum/x;
        System.out.println(mij);
    }


    public static void zuygKentSumAngam(int[]tver){
        int a1=0;
        int a2=1;
        int b1=0;
        int b2=1;
        for (int i=0;i<tver.length;i++){

            if(tver[i]%2!=0){
                a1=a1+tver[i];
                a2=a2*tver[i];

            }
            if(tver[i]%2==0){
                b1=b1+tver[i];
                b2=b2*tver[i];

            }

        }
        System.out.println("Kent tveri gumar@ "+a1);
        System.out.println("Kent tveri artadryal@ "+a2);
        System.out.println("Zuyg tveri gumar@ "+b1);
        System.out.println("Zuyg tveri artadryal@ "+b2);
    }

    public static void bazmapatikKin(int[]tver){
        int sum=0;
        int m=0;
        Scanner scanner=new Scanner(System.in);
        int k= scanner.nextInt();
        for (int j:tver){

            if(j%k==0){
                sum=sum+j;
                m++;
            }
        }
        double mij=sum/m;
        System.out.println(mij);
    }


}
