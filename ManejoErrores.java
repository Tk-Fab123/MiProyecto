public class ManejoErrores {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;

            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}