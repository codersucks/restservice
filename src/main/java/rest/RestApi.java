package rest;

import net.sf.json.JSONObject;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RestApi {
    public String Get(String uri,HttpHeaders requestHeaders,Map<String, String> params) {
        HttpEntity<String> requestEntity = new HttpEntity<>(null, requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(uri,HttpMethod.GET, requestEntity, String.class,params);
        JSONObject json = JSONObject.fromObject(responseEntity);
        return json.toString();
    }
    public String Post(String uri,HttpHeaders requestHeaders, MultiValueMap<String, String> requestBody) {
        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<>(requestBody, requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(uri,HttpMethod.POST, requestEntity, String.class);
        JSONObject json = JSONObject.fromObject(responseEntity);
        return json.toString();
    }
}
