package com.wangjian.gittest;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Wj
 * @date 2019/06/30
 */
public class TestJsonObject {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","你好");
        jsonObject.put("phone","12122121");
        String s = jsonObject.toString();
        System.out.println(s);
    }
}
