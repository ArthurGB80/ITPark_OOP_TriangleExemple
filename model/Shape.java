package itparkExemploTriangulo.model;

public abstract class Shape {

    private String name;

    public String getName() {return name;}

    protected void setName(String name) {this.name = name;}

    protected Shape(String name) {this.name = name;}

    @Override
    public String toString() {return "Name: " + name;}

    public abstract double getPerimeter();

    public abstract double getSquare();

}
