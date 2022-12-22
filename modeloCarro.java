
import java.util.Scanner;
public class modeloCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite la marca del auto ");
        String marca = sc.next();
        System.out.println("digite la modelo del auto ");
        String modelo = sc.next();

        System.out.println("la marca del auto es: " + marca + " y el modelo al que pertenece es del " + modelo);
    }

}
