package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import rest.RestApi;

import java.util.HashMap;
import java.util.Map;

public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestApi api = new RestApi();
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "");
        requestHeaders.add("Accept", "");
        requestHeaders.add("User-Identify", "");
        Map<String, String> params = new HashMap<>();
        params.put("id", "9");
        String response = api.Get("http://gturnquist-quoters.cfapps.io/api/random", requestHeaders, params);
        log.info(response);
    }
}

