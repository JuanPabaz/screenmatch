package com.jpproject.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtrar(Clasificable clasificable){
        if(clasificable.getClasificicacion() >= 4){
            System.out.println("Recomendado");
        }else if(clasificable.getClasificicacion() >= 2){
            System.out.println("Popular en el momento");
        }else{
            System.out.println("No Recomendado");
        }
    }
}
