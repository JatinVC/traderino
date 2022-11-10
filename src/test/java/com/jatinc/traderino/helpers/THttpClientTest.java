package com.jatinc.traderino.helpers;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class THttpClientTest {

    @Test
    void sendSuccessfulRequest() {
        String TEST_URL = "https://www.example.com";
        assertEquals(200, Objects.requireNonNull(THttpClient.sendGetRequest(TEST_URL)).getStatusLine().getStatusCode());
    }
}