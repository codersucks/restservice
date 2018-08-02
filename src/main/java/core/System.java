package core;

import common.Config;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import rest.RestApi;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class System implements CommandLineRunner {
    @Autowired
    private Config config;

    @Override
    public void run(String... args) throws Exception {

    }
    public void Register(){
        String uri=config.getUri()+"/VIID/System/Register";
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "");
        requestHeaders.add("Accept", "");
        requestHeaders.add("User-Identify", "");
        MultiValueMap<String, String> requestBody=new LinkedMultiValueMap<>();
        requestBody.add("RegisterObject","{\"DeviceID\":\"33010299011190000253\"}");
        RestApi api=new RestApi();
        String response=api.Post(uri,requestHeaders,requestBody);
        JSONObject object=JSONObject.fromObject(response);
        if("401".equals(object.getString("statusCodeValue"))){
            String headerBody=object.getString("headers");
        }
    }
    public void UnRegister(){

    }
    public void KeepAlive(){

    }
    public void Time(){

    }
    public String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }
}
