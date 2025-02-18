package ca.valador;

public class Vector {
    private double x1;
    private double x2;

    public Vector(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public double GetX1() {
        return x1;
    }
    public double GetX2() {
        return x2;
    }

    public void SetX1(double x1) {
    this.x1 = x1;
    }

    public void SetX2(double x1) {
    this.x1 = x1;
    }

    public String toString() {
        return "Vector{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}