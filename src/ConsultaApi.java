import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

 public class ConsultaApi {

    private static final String API_KEY = "bb4abe246194c0c6cc0ab393";
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";

    // Método para obtener la tasa de cambio desde la API
    public double obtenerTasaDesdeApi(String monedaBase, String monedaDestino) {
        String url = URL_BASE + API_KEY + "/pair/" + monedaBase + "/" + monedaDestino;

        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

            // Parseamos el JSON usando GSON
            JsonObject json = JsonParser.parseString(respuesta.body()).getAsJsonObject();

            if (json.has("conversion_rate")) {
                return json.get("conversion_rate").getAsDouble();  // tasa de cambio
            } else {
                System.out.println("Error: respuesta inesperada de la API.");
                return -1;
            }

        } catch (Exception e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
            return -1;
        }
    }
}
