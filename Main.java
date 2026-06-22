public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo"));

        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}