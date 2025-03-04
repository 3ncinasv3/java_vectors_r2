package ca.valador;
import java.lang.Math;


public class VectorCalculatorR2 {

    public Vector v1;
    public Vector v2;

    public Vector addVector(Vector v1, Vector v2) {
        Vector r  = new Vector(0, 0);
        r.setX1(v1.getX1() + v2.getX1());
        r.setX2(v1.getX2() + v2.getX2());
        return r;
    }

    public Vector subtractVector(Vector v1, Vector v2) {
        Vector r  = new Vector(0, 0);
        r.setX1(v1.getX1() - v2.getX1());
        r.setX2(v1.getX2() - v2.getX2());
        return r;
    }

    public Vector scalarMultipleVector(double t, Vector v1){
        Vector r = new Vector(0,0);
        r.setX1(t * v1.getX1());
        r.setX2(t * v1.getX2());

        return r;
    }
    
    public double magnitude(Vector v1) {
         return Math.sqrt((v1.getX1() * v1.getX1() + v1.getX2() * v1.getX2()));
    }

    public double dotProduct(Vector v1, Vector v2) {
        return ((v1.getX1() * v2.getX1() + v1.getX2() * v2.getX2()));
    }

    public double crossProduct(Vector v1, Vector v2) {
        return ((v1.getX1() * v2.getX2() - v1.getX2() * v2.getX1()));
    }
}
