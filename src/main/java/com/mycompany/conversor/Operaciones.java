package com.mycompany.conversor;

import java.io.*;
import okhttp3.*;
import org.json.JSONObject;

public class Operaciones {

  private double num; //Con este valor se haran las operaciones
  MostrarResultado ventanaResultado = new MostrarResultado();

  public void transferirValor() {
    PedirValor pedirValor = new PedirValor();
    setNum(pedirValor.getNum());
  }

  public void setNum(Double num) {
    this.num = num;
  }

  //Medidas

  public void cenMet() {
    ventanaResultado.setValor(this.num / 100);
    ventanaResultado.setUnidad("Metros");
    ventanaResultado.resultado();
  }

  public void metCen() {
    ventanaResultado.setValor(this.num * 100);
    ventanaResultado.setUnidad("Centimetros");
    ventanaResultado.resultado();
  }

  //Temperatura

  public void celFah() {
    ventanaResultado.setValor((this.num * 1.8) + 32);
    ventanaResultado.setUnidad("°Fahrenheit");
    ventanaResultado.resultado();
  }

  public void fahCel() {
    ventanaResultado.setValor((this.num - 32) / 1.8);
    ventanaResultado.setUnidad("°Celcius");
    ventanaResultado.resultado();
  }

  public void celKel() {
    ventanaResultado.setValor(num);
    ventanaResultado.setUnidad("°Kelvin");
    ventanaResultado.resultado();
  }

  public void kelCel() {
    ventanaResultado.setValor(this.num + 273.15);
    ventanaResultado.setUnidad("°Celcius");
    ventanaResultado.resultado();
  }

  //Monedas
  //peso mexicano a dolar
  public void pesDolar() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "MXN")
      .addQueryParameter("to", "USD")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");
    //double resultado = this.num + 1;

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Dólares");
    ventanaResultado.resultado();
  }

  //peso a euro
  public void pesEuro() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "MXN")
      .addQueryParameter("to", "EUR")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Euros");
    ventanaResultado.resultado();
  }

  //peso a libra
  public void pesLib() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "MXN")
      .addQueryParameter("to", "GBP")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Libras");
    ventanaResultado.resultado();
  }

  //peso a yen
  public void pesYen() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "MXN")
      .addQueryParameter("to", "JPY")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Yenes");
    ventanaResultado.resultado();
  }

  //peso a won coreano
  public void pesWon() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "MXN")
      .addQueryParameter("to", "KRW")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Wones");
    ventanaResultado.resultado();
  }

  //dolar a peso
  public void dolPes() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "USD")
      .addQueryParameter("to", "MXN")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Pesos");
    ventanaResultado.resultado();
  }

  //euro a peso
  public void eurPes() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "EUR")
      .addQueryParameter("to", "MXN")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Pesos");
    ventanaResultado.resultado();
  }

  //libra a peso
  public void libPes() throws IOException {
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    // Definir la URL de la API con los parámetros de la conversión
    HttpUrl url = HttpUrl
      .parse("https://api.apilayer.com/currency_data/convert")
      .newBuilder()
      .addQueryParameter("from", "GBP")
      .addQueryParameter("to", "MXN")
      .addQueryParameter("amount", String.valueOf(this.num))
      .build();

    Request request = new Request.Builder()
      .url(url)
      .addHeader("apikey", "xin1UNu6p624C0uRhCQT9clljhQZEWvm")
      .build();

    Response response = client.newCall(request).execute();
    String jsonString = response.body().string();

    // Analizar la respuesta en formato JSON para obtener el resultado de la conversión
    JSONObject json = new JSONObject(jsonString);
    double resultado = json.getDouble("result");

    ventanaResultado.setValor(resultado);
    ventanaResultado.setUnidad("Pesos");
    ventanaResultado.resultado();
  }
}
