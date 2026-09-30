package org.example;

import java.util.List;

public class Torneo {
    String nombre;
    List Participantes;

    public Torneo(String nombre){
        this.nombre = nombre;
    }
    public void AgregarPaticipante(){
        System.out.println("Ingrese el nombre del participante");
        if (nombre == nombre){
            System.out.println("se agrego a:" + nombre + "como nuevo participante del torneo");
        }
        else {
            System.out.println("No se a agregado a ningun participante");

        }
    }
    public void IniciarTorneo(){

    }


}
