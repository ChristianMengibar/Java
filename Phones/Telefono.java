public class Telefono {
    private String marca;
    private double precio;
    private int stock;

    public Telefono(String marca, double precio, int stock) {
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public Telefono(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
        this.stock = 10;
    }

    public boolean hayStock() {
        return getStock() > 0;
    }

    public void comprar() {
        if (!hayStock()) {
            System.out.println("No hay stock");
        } else {
            setStock(getStock() - 1);
            System.out.println("Compraste el " + getMarca() + " " + getPrecio() + " ,todavia quedan: " + getStock());
        }
    }

    public void comprar(int cantidad){
        if (!hayStock() || getStock() < cantidad){
            System.out.println("No hay stock suficiente");
        }else{
            setStock(getStock()-cantidad);
            System.out.println("Compraste el " + getMarca() + " " + getPrecio()*cantidad);
        }
    }

    public void info() {
        System.out.println("El telefono de la marca " + getMarca() + " tiene un precio de " + getPrecio());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
