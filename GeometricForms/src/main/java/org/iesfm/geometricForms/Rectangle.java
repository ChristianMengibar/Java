package org.iesfm.geometricForms;

import java.util.Objects;

public class Rectangle extends GeometricForm {
    public double base;
    public double height;

    public Rectangle(double x, double y, String color, String form, double base, double height) {
        super(x, y, color, form);
        this.base = base;
        this.height = height;
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("La figura se encuentra en las siguientes coordenadas: (" + x + "," + y + ").");
        System.out.println("Es de color: " + color + ", ");
        System.out.println("soy de tipo: " + form + ", ");
        System.out.println("mi base mide " + base + " cm, y mi altura es: " + height + " cm.");
    }

    @Override
    public void getArea() {
        double area = base * height;
        System.out.println("EL area del rectangulo es: " + area + ".");
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * base + 2 * height;
        System.out.println("EL perimetro del cuadrado es: " + perimeter + ".");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.base, base) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }
}
