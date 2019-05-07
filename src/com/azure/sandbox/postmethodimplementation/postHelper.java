package com.azure.sandbox.postmethodimplementation;


import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class postHelper {

    private void sendGet() throws  Exception{
        String url = "https://www.google.com/search?q=developer";
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);

    }
}
