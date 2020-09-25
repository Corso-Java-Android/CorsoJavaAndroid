package geometria.bootstrap;

import geometria.logic.Cerchio;

public class Driver {
    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio();
        System.out.println("Cerchio di Raggio: " + cerchio.getRaggio() + ", Diametro: " + cerchio.getDiametro());
        System.out.println("Area: " + cerchio.area() + ", Perimetro: " + cerchio.circonferenza()+"\n---------");

        Cerchio cerchio2 = new Cerchio(12);
        System.out.println("Cerchio di Raggio: " + cerchio2.getRaggio() + ", Diametro: " + cerchio2.getDiametro());
        System.out.println("Area: " + cerchio2.area() + ", Perimetro: " + cerchio2.circonferenza());
    }
}
