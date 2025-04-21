package com.jpproject.screenmatch.principal;

import com.google.gson.Gson;
import com.jpproject.screenmatch.modelos.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la pelicula a buscar: ");
        var pelicula = sc.nextLine();
        String url = "https://www.omdbapi.com/?t="+pelicula +"&apikey=1436a691";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            Titulo titulo = gson.fromJson(json, Titulo.class);
            System.out.println(titulo.getTitulo());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
