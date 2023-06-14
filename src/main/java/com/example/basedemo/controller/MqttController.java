package com.example.basedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MqttController {
    @RequestMapping("/info")
    public String index() {
        String jsonStr = "{\n" +
                "    \"msg\": \"success\",\n" +
                "    \"code\": 200,\n" +
                "    \"data\": [\n" +
                "\t\t{\"descript\": \"厂房大门温度\", \"name\": \"区域 001\", \"code\": \"bigdata-mqtt-ttyS0_1_10_3\", \"max\": \"100\", \"min\": \"0\", \"type\": \"\", \"unit\": \"\"}\n" +
                "\t]\n" +
                "}";
        return jsonStr;
    }

    @RequestMapping("/real")
    public String apitest() {
        String timeStr = String.valueOf(System.currentTimeMillis());
        String value = String.valueOf(new Random().nextInt(5));
        String jsonStr = "{\n" +
                "    \"msg\": \"success\",\n" +
                "    \"code\": 200,\n" +
                "    \"data\": [\n" +
                "\t\t{\"code\": \"bigdata-mqtt-ttyS0_1_10_3\", \"time\": "+System.currentTimeMillis()+", \"value\": \""+value+"\"\n" +
                "\t}]\n" +
                "}";
        return jsonStr;
    }


    public static void main(String[] args) {
        String timeStr = String.valueOf(System.currentTimeMillis());
        String value = String.valueOf(new Random().nextInt(5));

        String jsonStr = "{\n" +
                "    \"msg\": \"success\",\n" +
                "    \"code\": 200,\n" +
                "    \"data\": [\n" +
                "\t\t{\"code\": \"bigdata-mqtt-ttyS0_1_10_3\", \"time\": "+System.currentTimeMillis()+", \"value\": \""+value+"\"\n" +
                "\t}]\n" +
                "}";
        System.out.println(jsonStr);
    }
}