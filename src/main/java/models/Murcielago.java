package main.java.models;

import main.java.models.interfaces.RespirarAble;
import main.java.models.interfaces.VolarAble;

public class Murcielago implements RespirarAble,VolarAble {

    @Override
    public void Respirar(){
        System.out.println("El murcielago respira");
    }

    @Override
    public void Volar(){
        System.out.println("El murcielago se vuela");
    }
}
