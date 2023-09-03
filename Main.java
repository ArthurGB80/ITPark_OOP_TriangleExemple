package itparkExemploTriangulo;
import itparkExemploTriangulo.model.triangle.RightTriangle;
import itparkExemploTriangulo.model.triangle.Triangle;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle);

        System.out.println();

        RightTriangle rightTriangle = new RightTriangle(3,4);
        System.out.println(rightTriangle);




    }
}