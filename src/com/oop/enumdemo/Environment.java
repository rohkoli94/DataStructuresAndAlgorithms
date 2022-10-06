package com.oop.enumdemo;

public enum Environment {
    PROD("https:prod/1234"),
    UAT("https:uat/1234"),
    DEV("https:dev/1234"),
    QC("https:qc/1234");

    private String url;


    Environment(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    public static void main(String[] args) {

        for (Environment ev: Environment.values()){
            System.out.println(ev+ ":: "+ ev.getUrl());
        }

        String ev1 = Environment.PROD.getUrl();
        System.out.println(ev1);

        Environment ev2 = Environment.valueOf("PROD");
        System.out.println(ev2.getUrl());
    }
}
