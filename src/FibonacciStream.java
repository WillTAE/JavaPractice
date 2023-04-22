import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===BIENVENIDOS AL GENERADOR DE FIBONACCI===");
        System.out.print("Ingrese la cantidad de numeros: ");
        int cantidadNumeros = scanner.nextInt();
        System.out.println(FibonacciStream.generate(cantidadNumeros));
    }

    static List generate(int n){
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(n)
                .map(m -> m[0])
                .collect(Collectors.toList());
    }
}
