package ca.valador;

public class Main {
 
    public static void main (String[] args) {
    System.out.println("Hello World");
    VectorCalculator calc = new VectorCalculator();
    Vector v1 = new Vector(2, 3);
    Vector v2 = new Vector(-2 , -3);

    Vector x = calc.addVector(v1, v2);

    System.out.println("v1 = " + v1.toString());
    System.out.println("v2 = " + v2.toString());

    System.out.print("v1+v2 = " + x.toString());

    x = calc.subtractVector(v1, v2);
    System.out.println("v1-v2 = " + x.toString());

    x = calc.scalarMultipleVector(5, v1);
    System.out.println("5*v1 = " + x.toString());

    System.out.println(calc.magnitude(v1));

    System.out.println(calc.dotProduct(v1, v2));







    }
}
