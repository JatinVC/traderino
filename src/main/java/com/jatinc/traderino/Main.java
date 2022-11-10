package com.jatinc.traderino;

import com.jatinc.traderino.helpers.THttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        final String URL = "https://www.example.com";
        CloseableHttpResponse response = (CloseableHttpResponse) THttpClient.sendGetRequest(URL);
        System.out.println(Objects.requireNonNull(response).getStatusLine().getStatusCode());
    }
}
