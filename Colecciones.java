import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        for (String p : productos) {
            System.out.println(p);
        }
    }
}