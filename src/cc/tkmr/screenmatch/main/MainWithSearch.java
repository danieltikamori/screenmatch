package cc.tkmr.screenmatch.main;

import cc.tkmr.screenmatch.models.Title;
import cc.tkmr.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie name:");
        String movieName = scanner.nextLine().replaceAll("\\s+", "+");

        String searchAddress = "https://omdbapi.com/?t="+movieName+"&apikey=9b689370";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(searchAddress))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        String titleNameJson = response.body();
        System.out.println(titleNameJson);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TitleOmdb myTitleOmdb = gson.fromJson(titleNameJson, TitleOmdb.class);
        System.out.println("Title Name: " + myTitleOmdb);
        Title myTitle = new Title(myTitleOmdb, myTitleOmdb);
        System.out.println(myTitle);
        System.out.println();
    }


}
