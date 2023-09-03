package itparkExemploTriangulo.model.triangle;

public class RightTriangle extends Triangle {
    public RightTriangle(double firstSide, double secondSide) {
        super(firstSide, secondSide, Math.hypot(firstSide, secondSide));
        this.setName("Right Triangle");
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }
}
