public class MethodArguments {
    //Metodo que divide 2 parametros que se le pasan por entrada
    private static double division (double a, double b){
        return a*b;
    }

    //Metodo que imprime un parametro (en este caso un double)
    private static void print (double a){
        System.out.println("El resultado de la division es:" + a);
    }

    public static void main(String [] args) {
        //Compruebo que se pasen 2 metodos
        if (args.length == 2) {
            //Parseo argumentos
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            //Compruebo que el segundo no sea 0
            if (num2 != 0) {
                //Invoco el metodo y lo guardo en la variable double "result"
                double result = division(num1, num2);
                //Invoco el metodo print que imprime la variable
                print(result);
            }else{
                //En caso de el segundo parametro sea 0 imprimo este ERROR
                System.err.println("ERROR 0 en el segundo argumento");
            }
        }else{
            //En caso de no pasar 2 argumentos imprimo este ERROR
            System.err.println("ERROR tiene que tener 2 metodos");
        }
    }
}
