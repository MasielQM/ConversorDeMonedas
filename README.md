💱Conversor de Monedas:

Este es un proyecto en Java que permite convertir entre distintas monedas usando datos actualizados desde una API externa. 
El usuario puede elegir entre diferentes opciones de conversión y obtener el valor equivalente según el tipo de cambio actual.

🖥️Funcionalidades y Ejecución del programa:

-El programa convierte el valor de una moneda hacia otra en las siguientes combinaciones
-El usuario selecciona una opción del menú y luego introduce el monto que desea convertir

1. Dólar (USD) a Peso Argentino (ARS)  
2. Peso Argentino (ARS) a Dólar (USD)  
3. Dólar (USD) a Real Brasileño (BRL)  
4. Real Brasileño (BRL) a Dólar (USD)  
5. Dólar (USD) a Peso Colombiano (COP)  
6. Peso Colombiano (COP) a Dólar (USD)  
7. Salir del programa

Tecnologías y Librerías Utilizadas

- Lenguaje: Java
- Librerías estándar:
  - `HttpClient` (para realizar solicitudes HTTP)
  - `HttpRequest`
  - `HttpResponse`
- Librería externa:
  - [GSON](https://github.com/google/gson) (para manejar respuestas JSON)

Fuente de datos (API)

Se utiliza la API pública de ExchangeRate API para obtener los tipos de cambio actualizados:

> https://v6.exchangerate-api.com/v6/

📌Este proyecto se desarrolló en IntelliJ IDEA con soporte para Java.  
Puedes compilar y ejecutar desde la consola o directamente desde el entorno IntelliJ.


🙋‍♀️ Autor

- **MasielQM**  
[Repositorio en GitHub](https://github.com/MasielQM/ConversorDeMonedas)
