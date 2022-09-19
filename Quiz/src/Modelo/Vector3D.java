package Modelo;


public class Vector3D {
    
    private double[] vector = new double [3];

    public Vector3D() {
        this.vector[0]=0;
        this.vector[1]=0;
        this.vector[2]=0;
    }
    public Vector3D(double x, double y , double z){
        
        this.vector[0] = x;
        this.vector[1] = y;
        this.vector[2] = z;
        
    }

    public String getVector() {
        return "("+vector[0]+","+vector[1]+","+vector[2]+")";
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }
    public String sumVector(double x, double y, double z){
        
        double [] vector2 = {x,y,z};
        double [] total = new double [3];
        
        for (int i = 0; i < 3; i++) {
            total[i]=this.vector[i]+vector2[i];
        }
        
        return "("+total[0]+","+total[1]+","+total[2]+")";
        
    }
    public double moduleVector(){
        
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total+=Math.pow(vector[i], 2);
        }
        return Math.sqrt(total);
    }
    
    public String scalarMultiplicacion(double escalar){
        double [] total = new double [3];
        for (int i = 0; i < 3; i++) {
            total[i]=this.vector[i]*escalar;
        }
        return "("+total[0]+","+total[1]+","+total[2]+")";
    }
}
