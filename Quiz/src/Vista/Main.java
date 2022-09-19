package Vista;

import Modelo.Vector3D;


public class Main {
    public static void main(String[] args) {
        Vector3D v1= new Vector3D(1, 2, 3);
        System.out.println(v1.sumVector(5, 5, 5));
        System.out.println(v1.moduleVector());
        System.out.println(v1.scalarMultiplicacion(5));
    }
    
}
