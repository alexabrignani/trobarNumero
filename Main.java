package com.trobarNumero;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int numeroTrobar = 5;
        Random numeroLlista= new Random();
        ArrayList llistaNumeros=new ArrayList();
        for (int i=0;i<500000;i++){
            llistaNumeros.add(numeroLlista.nextInt(100));
        }

        if (llistaNumeros.contains(5)){
            long endTime = System.currentTimeMillis()-startTime;
            System.out.println(endTime);
        }else {
            System.out.println("No el conte");
        }
    }
}
