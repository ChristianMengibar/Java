package org.iesfm.geometricForms;

import java.util.Objects;

public abstract class GeometricForm {
    public double x;
    public double y;
    public String color;
    public String form;

    public GeometricForm(double x, double y, String color, String form) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.form = form;
    }

    public void info() {
        System.out.println("La figura se encuentra en las siguientes coordenadas: (" + x + "," + y + ").");
        System.out.println("Es de color: " + color + ", ");
        System.out.println("Y es de tipo: " + form + ".");
    }

    protected abstract void showSpecificInfo();

    protected abstract void getArea();

    protected abstract void getPerimeter();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricForm that = (GeometricForm) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Objects.equals(color, that.color) && Objects.equals(form, that.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color, form);
    }
}
