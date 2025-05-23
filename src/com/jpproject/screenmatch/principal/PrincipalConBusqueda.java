package com.jpproject.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jpproject.screenmatch.excepciones.ConversionRuntimeException;
import com.jpproject.screenmatch.modelos.Titulo;
import com.jpproject.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){

            System.out.println("Introduce la pelicula a buscar: ");
            var pelicula = sc.nextLine();
            if (pelicula.equalsIgnoreCase("Salir")){
                break;
            }

            String url = "https://www.omdbapi.com/?t="+ pelicula.replace(" ", "+") +"&apikey=1436a691";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);
                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println(titulo);
                titulos.add(titulo);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                System.out.println("Error: ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e) {
                System.out.println("Error de URL: ");
                System.out.println(e.getMessage());
            }catch (ConversionRuntimeException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Finalizó la ejecución del programa");
            }
        }

        System.out.println(titulos);
        FileWriter fw = new FileWriter("peliculas.json");
        fw.write(gson.toJson(titulos));
        fw.close();
        System.out.println("Archivo JSON creado exitosamente.");

    }
}
