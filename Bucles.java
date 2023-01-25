public class Bucles {
    //Metodo que calcula la media de un array de double
    private static double average (double[] lista){
        //Creo una variable resultado y la inicializo a 0
        double result = 0;
        //Recorro el array de doubles
        for (int i = 0; i < lista.length; i++){
            //Sumo todos los numeros del array y los guardo en la variable result
            result = lista[i] + result;
        }
        //Divido el resultado de sumar todos los numeros del array y lo divido por el tamaño
        return result/lista.length;
    }
    //Metodo que imprime en pantalla la variable que se le pasa por entrada

    private static void print (double a){
        System.out.println("La media es" + a);
    }
    //Metodo principal del programa

    public static void main (String [] args){
        //Compruebo que se le pasen 1 o mas parametros
        if(args.length >= 1){
            //Creo un array de double, con el tamaño de argumentos del programa
            double [] listaNumeros = new double[args.length];
            //Recorro el array
            for(int i = 0; i < listaNumeros.length; i++){
                //Guardo en mi array los argumentos que le entran
                listaNumeros[i] = Double.parseDouble(args[i]);
            }
            //Invoco el metodo y guardo el resultado en una variable double
            double num1 = average(listaNumeros);
            //Invoco el metodo que imprime en pantalla la variable
            print(num1);
        }else{
            //En caso de tener menos de 1 argumento imprime el ERROR
            System.err.println("ERROR no hay argumentos");
        }
    }
}
