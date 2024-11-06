package main.java.models;

import main.java.models.interfaces.NadarAble;
import main.java.models.interfaces.RespirarAble;
import main.java.models.interfaces.TerrestreAble;
import main.java.models.interfaces.VolarAble;

public class Pato implements RespirarAble,TerrestreAble,NadarAble,VolarAble {

    @Override
    public void Respirar(){
        System.out.println("El pato respira");
    }

    @Override
    public void Dezplazarse(){
        System.out.println("El pato se desplaza");
    }

    @Override
    public void Volar(){
        System.out.println("El pato vuela");
    }

    @Override
    public void Nadar(){
        System.out.println("El pato nada");
    }
}

