package ca.valador;

public class Main {
 
    public static void main (String[] args) {
    System.out.println("Hello World");
    VectorCalculator calc = new VectorCalculator();
    Vector x1 = new Vector(2, 3);
    Vector x2 = new Vector(-2 , -3);

    Vector x = calc.addVector(x1, x2);

    System.out.println("v1 = " + x1.toString());
    System.out.println("v2 = " + x2.toString());

    System.out.print("v1+v2 = " + x.toString());

    x = calc.subtractVector(x1, x2);
    System.out.print("v1-v2 = " + x.toString());







    }
}
