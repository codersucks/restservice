package core;

import common.Config;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import rest.RestApi;

public class Subscribe implements CommandLineRunner {
    @Autowired
    private Config config;

    @Override
    public void run(String... args) throws Exception {

    }
    public void Subscribe(){
        String uri=config.getUri()+"/VIID/System/Register";
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "");
        requestHeaders.add("Accept", "");
        requestHeaders.add("User-Identify", "");
        MultiValueMap<String, String> requestBody=new LinkedMultiValueMap<>();
        requestBody.add("RegisterObject","{\"DeviceID\":\"33010299011190000253\"}");
        RestApi api=new RestApi();
        String response=api.Post(uri,requestHeaders,requestBody);
    }
    public void UnSubscribe(){
       //TODO
    }
}
