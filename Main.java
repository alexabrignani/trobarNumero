package com.trobarNumero;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int numeroTrobar = 5;
        Random numeroLlista= new Random();
        ArrayList<Integer> llistaNumeros=new ArrayList<Integer>();
        for (int i=0;i<700000;i++){
            llistaNumeros.add(numeroLlista.nextInt(100));
        }
        long endTime=0;
        for (int i=0;i<llistaNumeros.size();i++){
            if (llistaNumeros.get(i)%2==0){
                if (llistaNumeros.get(i)==5){
                    endTime = System.currentTimeMillis()-startTime;break;
                }
            }
        }
        System.out.println(endTime);

    }
}
