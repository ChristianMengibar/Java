public class mainTelefonos {
    public static void main(String[] args) {
        Telefono apple = new Telefono("apple", 1029.00, 4);
        Telefono huawei = new Telefono("huawei", 379.99, 6);

        apple.info();;
        apple.hayStock();
        apple.comprar();
        apple.hayStock();
        huawei.info();
        huawei.hayStock();
        huawei.comprar();
        huawei.hayStock();
    }
}
