package com.example.demo.bigtalkdesignpatterns.flyweightpatterns;

import java.util.HashMap;

public class WebSiteFactory {

    private HashMap<String, Object> hashMap = new HashMap<>();

    public WebSite getWebSiteCategory(String key){
        if (!hashMap.containsKey(key)){
            hashMap.put(key, new ConcreteWebSite(key));
        }
        return (WebSite)hashMap.get(key);
    }

    public int getWebSiteCount(){
        return hashMap.size();
    }

}
