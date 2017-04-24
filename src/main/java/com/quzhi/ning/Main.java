package com.quzhi.ning;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;

import java.util.concurrent.Future;

/**
 * Created by zhiqu on 4/24/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        Future<Response> f = asyncHttpClient.prepareGet("http://httpstat.us/200").execute();
        Response response = f.get();
        System.out.println("response code: " + response.getStatusCode());
        System.out.println("response body: " + response.getResponseBody());
    }
}
