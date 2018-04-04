package ar.edu.um.programacion2_2018.tp1_consigna1;

public class Inicio {
    public static void main (String[] args){
        Inicio iniciar = new Inicio();
        iniciar.inicio();
    }

    public void inicio(){
        Persona persona1 = new Persona(30052419,"Matias","Figueredo");
        persona1.show();
        System.out.println(persona1.toString());
    }

}
