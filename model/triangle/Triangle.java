package itparkExemploTriangulo.model.triangle;

import java.util.Objects;
import itparkExemploTriangulo.model.Shape;

public class Triangle extends Shape {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super("Triangles");
        if (canBeConstructed(firstSide, secondSide, thirdSide)) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        } else {
            throw new IllegalArgumentException("Unable to create a triangle. The sides of the triangle should" +
                    " be less than the third party and greater than the first party");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.firstSide, firstSide) == 0 &&
                Double.compare(triangle.secondSide, secondSide) == 0 &&
                Double.compare(triangle.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nCatet 1: " + firstSide +
                "\nCatet 2: " + secondSide +
                "\nHypotenuse: " + thirdSide +
                "\nPerimeter: " + getPerimeter() +
                "\nSquare: " + getSquare();
    }

    @Override // estudar isso
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    private boolean canBeConstructed(double firstSide, double secondSide, double thirdSide) {

        /*
         * if (firstSide + secondSide + <= thirdSide) {
         * return false;
         * }
         * if (firstSide + thirdSide <= secondSide) {
         * return false;
         * }
         * if (secondSide + thirdSide <= firstSide) {
         * return false;
         * 
         * }
         * return true;
         */

        return
        firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide;

    }
}
