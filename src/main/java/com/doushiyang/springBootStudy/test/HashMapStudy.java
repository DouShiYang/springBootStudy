package com.doushiyang.springBootStudy.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapStudy {


    public static void main(String[] args) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        Object put = stringObjectHashMap.put("1", null);
        System.out.println(put);


        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        objectObjectConcurrentHashMap.put(1,1);
    }
}
