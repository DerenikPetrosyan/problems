package com.iunetworks;

import java.sql.Array;
import java.util.Arrays;

public class CharSim {
    public static void aCHar(char[] sim){
        int sum=0;
        for (int i = 0; i < sim.length; i++) {
            if(sim[i]=='a'){
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static void kicPoqr(char[]sim){
        int sum=0;
        for (int i = 0; i < sim.length; i++) {
            if(sim[i]<'k')sum++;}
        System.out.println(sum);         }



    public static void kentIndex(char[]sim){
        int kentSize=sim.length/2;
        char[] kent=new  char[kentSize];
        for (int i = 0; i < sim.length; i++) {
            if(i%2!=0){
                 kent[i/2]=sim[i];
            }
        }
        System.out.println(Arrays.toString(kent));
    }


}
