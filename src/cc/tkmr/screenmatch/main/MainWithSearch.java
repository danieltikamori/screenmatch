package cc.tkmr.screenmatch.main;

import cc.tkmr.screenmatch.exceptions.YearConversionExceptionError;
import cc.tkmr.screenmatch.models.Title;
import cc.tkmr.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String movieName = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();


        while (!movieName.equalsIgnoreCase("quit")) {
            System.out.println("Enter a movie name:");
            movieName = scanner.nextLine().replaceAll("\\s+", "+");

            if (movieName.equalsIgnoreCase("quit")) {
                break;
            }

            String searchAddress = "https://omdbapi.com/?t=" + movieName + "&apikey=9b689370";
            try {
                HttpClient httpClient = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(searchAddress))
                        .build();
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                String titleNameJson = response.body();
                System.out.println(titleNameJson);

                TitleOmdb myTitleOmdb = gson.fromJson(titleNameJson, TitleOmdb.class);
                System.out.println("Title Name: " + myTitleOmdb);
//        try {
                Title myTitle = new Title(myTitleOmdb, myTitleOmdb);
                System.out.println(myTitle);
                System.out.println();

                titles.add(myTitle);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (YearConversionExceptionError e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter("titles.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Thank you for using ScreenMatch");
    }


}
