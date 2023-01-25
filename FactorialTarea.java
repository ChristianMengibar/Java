public class FactorialTarea {
    static int factorial(int a) {
       int factorial = 1;
       for (int i = 1 ; i <= a; i++){
           factorial = factorial * i;
       }
       return factorial;
    }
    public static void main(String[] args) {
        if (args.length == 2) {
            int resultado =0;
            int v1 = Integer.parseInt(args[0]);
            int v2 = Integer.parseInt(args[1]);
            if ((v1 > 1) && (v2 > 1)) {
                if(v1 < v2) {
                    for (int i = v1; i <= v2; i++) {
                        resultado = factorial(i);
                        System.out.println("El factorial de " + i + " es " + resultado);
                    }
                }else{
                    for (int i = v2; i <= v1; i++) {
                        resultado = factorial(i);
                        System.out.println("El factorial de " + i + " es " + resultado);
                    }
                }
            } else {
                System.out.println("pon un texto que diga que argumentos mayor que 1");
            }
        } else {
            System.out.println("pon un texto que diga que tiene que tener 2 argumentos");
        }
    }
}
