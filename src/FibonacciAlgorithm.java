import java.util.Scanner;

public class FibonacciAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===BIENVENIDOS AL GENERADOR DE FIBONACCI===");
        System.out.print("Ingrese la cantidad de numeros: ");
        int cantidadNumeros = scanner.nextInt();

        int temp1 = 0;
        int temp2 = 1;
        int temp3;

        if (cantidadNumeros >=1){
            System.out.println(temp1);
        }
        if(cantidadNumeros >= 2){
            System.out.println(temp2);
        }
            for (int i=3; i <= cantidadNumeros; i ++){
                temp3 = temp1 + temp2;
                System.out.println(temp3);
                temp1 = temp2;
                temp2 = temp3;
            }
    }


}
