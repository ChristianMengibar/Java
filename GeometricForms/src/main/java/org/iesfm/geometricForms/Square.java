package org.iesfm.geometricForms;

import java.util.Objects;

public class Square extends GeometricForm {
    public double side;

    public Square(double x, double y, String color, String form, double side) {
        super(x, y, color, form);
        this.side = side;
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("La figura se encuentra en las siguientes coordenadas: (" + x + "," + y + ").");
        System.out.println("Es de color: " + color + ", ");
        System.out.println("soy de tipo: " + form + ", ");
        System.out.println("y mi lado mide: " + side + " cm.");
    }

    @Override
    public void getArea() {
        double area = side * side;
        System.out.println("EL area del cuadrado es: " + area + ".");
    }

    @Override
    public void getPerimeter() {
        double perimeter = 4 * side;
        System.out.println("EL area del cuadrado es: " + perimeter + ".");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
