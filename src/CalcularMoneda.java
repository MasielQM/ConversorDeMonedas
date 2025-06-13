import java.util.Scanner;

public class CalcularMoneda {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        ConsultaApi api = new ConsultaApi();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Sea bienvenido/a al Conversor de Monedas");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Salir");
            System.out.print("Elija una opción válida: ");

            int opcion = scanner.nextInt();
            String base = "";
            String destino = "";

            switch (opcion) {
                case 1: base = "USD"; destino = "ARS"; break;
                case 2: base = "ARS"; destino = "USD"; break;
                case 3: base = "USD"; destino = "BRL"; break;
                case 4: base = "BRL"; destino = "USD"; break;
                case 5: base = "USD"; destino = "COP"; break;
                case 6: base = "COP"; destino = "USD"; break;
                case 7:
                    continuar = false;
                    System.out.println("¡Gracias por utilizar el Conversor de Monedas! ");
                    continue;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            // 👉 Aquí se corrige
            double tasa = api.obtenerTasaDesdeApi(base, destino);

            if (tasa != -1) {
                Conversion conversion = new Conversion(base, destino, tasa);
                System.out.println(conversion.mostrarConversion());
            } else {
                System.out.println("No se pudo obtener la tasa para " + base + " -> " + destino);
            }
        }

        scanner.close();
    }
}