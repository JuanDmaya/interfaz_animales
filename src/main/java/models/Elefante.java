package main.java.models;

import main.java.models.interfaces.RespirarAble;
import main.java.models.interfaces.TerrestreAble;

public class Elefante implements RespirarAble,TerrestreAble {

    
    public void Respirar(){
        System.out.println("El elefante respira");
    }

   
    public void Dezplazarse(){
        System.out.println("El elefante se desplaza");
    }
}


