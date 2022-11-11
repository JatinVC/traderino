package com.jatinc.traderino.helpers;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.net.URI;

/**
 * Helper functions to make http requests
 *
 * @author JatinVC
 * @version 1.0
 * @since 2022-11-10
 */
public class THttpClient {

    private THttpClient(){
        throw new UnsupportedOperationException("Utility classes require no constructors");
    }

    /**
     * General function to send a http request to an endpoint,
     * Will be used by other functions to send http requests
     * @param url the url of the request
     * @return an object with the http response
     */
    public static HttpResponse sendGetRequest(String url) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            return httpClient.execute(request);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    // TODO create a post helper
    // TODO create a helper to get the stock data
}
