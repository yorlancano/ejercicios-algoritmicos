
import java.util.Scanner;

public class precios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columna = 2;
        int filas = 5;
        int sumaTotal = 0;
        int[][] listaPrecio = new int[filas][columna];
        System.out.println("Querido usuario se le informa que a la hora de ingresar los precios coloque primero una IDE y despues si el precio");
        for (int i = 0; i < listaPrecio.length; i++) {
            for (int j = 0; j < listaPrecio[0].length; j++) {
                listaPrecio[i][j] = Integer.parseInt(sc.next());
                if (listaPrecio[i][j] == listaPrecio[i][1]) {
                    sumaTotal += listaPrecio[i][j];
                }

            }
            System.out.println();
        }

        for (int i = 0; i < listaPrecio.length; i++) {
            for (int j = 0; j < listaPrecio[0].length; j++) {
                System.out.print("[" + listaPrecio[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        int subtotal = 0;
        int precioIva = 0;
        int opciones = 0;
        int totalSumaSubtotal = 0;
        System.out.println("digite a cuantos elementos quiere adceder");
        int vecesProductos = sc.nextInt();
        while (opciones < vecesProductos) {
            System.out.println("digite a que fila desea adceder");
            int escoger = sc.nextInt();
            for (int i = 0; i < listaPrecio.length; i++) {
                for (int j = 0; j < listaPrecio[0].length; j++) {
                    if (listaPrecio[escoger - 1][j] == listaPrecio[i][j]) {
                        System.out.println(listaPrecio[escoger - 1][j]);
                        if (listaPrecio[escoger - 1][j] == listaPrecio[i][1]) {
                            totalSumaSubtotal += listaPrecio[escoger - 1][j];
                            subtotal = listaPrecio[escoger - 1][j];
                            precioIva = listaPrecio[escoger - 1][j];
                            int iva = precioIva * 19 / 100;
                            System.out.println("el valor del iva del producto selccionado es el siquiente: " + iva + " y el subtotal del producto es " + subtotal);
                        }
                    }
                }
            }
            opciones += 1;
        }

        System.out.println("el precio total de todos los elementos es el siguiente: " + sumaTotal + " y el subtotal viene siendo el siguiente de los producto que escojio: " + totalSumaSubtotal);

    }
}