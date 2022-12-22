import java.util.Scanner;
public class perimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("digite el " + (i + 1) + " lado ");
            int lado = sc.nextInt();
            suma += lado;
        }
        System.out.println("el perimetro del cuadrado es " + suma);
    }
}