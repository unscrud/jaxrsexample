package dev.unscrud;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import dev.unscrud.model.Pessoa;

public class PessoaBuilder {
  public static void build(Pessoa pessoa) throws IOException, InterruptedException {
    String caminho = "http://localhost:8080/pessoa";
    String json = new Gson().toJson(pessoa);
    URI uri = URI.create(caminho);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder(uri)
        .POST(BodyPublishers.ofString(json))
        .header("Content-type", "application/json")
        .build();

    client.send(request, BodyHandlers.discarding());
  }
}
