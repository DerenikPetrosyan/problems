package com.iunetworks;

public class ArrayXY {
    public static void mijXYartadryal(int[] x,int[] y){
        int sum1=0;
        int sum2=0;
        for(int i=0;i< x.length;i++){
            sum1=sum1+x[i];
            sum2=sum2+y[i];
        }
        int mijartadryal=sum1*sum2/ x.length/ y.length;
        System.out.println(mijartadryal);
    }
    public static void drakanQanakXY(int[] x,int[] y){
        int sum1=0;
        int sum2=0;
        for(int i=0;i< x.length;i++){
            if(x[i]>0){
                sum1++;
            }
            if(y[i]>0){
                sum2++;
            }
        }
        int mijsum=sum1+sum2;
        System.out.println(mijsum);
    }
    public static void xKentYzuygsum(int[] x,int[] y){
        int sum1=0;
        int sum2=0;
        for(int i=0;i< x.length;i++){
            if(i%2!=0){
                sum1=sum1+x[i];
            }
            if(i%2==0){
                sum2=sum2+y[i];
            }
        }
        int sum=sum1+sum2;
        System.out.println(sum);
    }
}
