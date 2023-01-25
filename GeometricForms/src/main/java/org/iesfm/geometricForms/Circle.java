package org.iesfm.geometricForms;

import java.util.Objects;

public class Circle extends GeometricForm {
    public double center;
    public double radius;

    public Circle(double x, double y, String color, String form, double center, double radius) {
        super(x, y, color, form);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("La figura se encuentra en las siguientes coordenadas: (" + x + "," + y + ").");
        System.out.println("Es de color: " + color + ", ");
        System.out.println("soy de tipo: " + form + ", ");
        System.out.println("mi centro mide: " + center + " cm, y mi radio es: " + radius + " cm.");
    }

    @Override
    public void getArea() {
        double area = Math.PI * this.radius * this.radius;
        System.out.println("El area del circulo es: " + area + ".");
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("El perimetro del circulo es: " + perimeter + ".");
    }

    public double getCenter() {
        return center;
    }

    public void setCenter(double center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.center, center) == 0 && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), center, radius);
    }
}
