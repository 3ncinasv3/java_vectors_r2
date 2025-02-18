package ca.valador;

public class VectorCalculator {

    public Vector v1;
    public Vector v2;

    public Vector addVector(Vector v1, Vector v2) {
        Vector r  = new Vector(0, 0);
        r.SetX1(v1.GetX1() + v2.GetX1());
        r.SetX2(v1.GetX2() + v2.GetX2());
        return r;
    }

    public Vector subtractVector(Vector v1, Vector v2) {
        Vector r  = new Vector(0, 0);
        r.SetX1(v1.GetX1() - v2.GetX1());
        r.SetX2(v1.GetX2() - v2.GetX2());
        return r;
    }
    
}
