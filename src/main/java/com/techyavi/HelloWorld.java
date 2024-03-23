package com.techyavi;

import static spark.Spark.get;
import static spark.Spark.staticFiles;

public class HelloWorld implements SparkApplication {

    public static void main(String[] args) {
        new HelloWorld().init();
    }

    @Override
    public void init() {
        staticFiles.externalLocation("src/main/resources/web"); // Serve files from the web folder

        get("/techyavi", (req, res) -> {
            res.type("text/html");
            return "<!DOCTYPE html><html><head><link rel=\"stylesheet\" href=\"styles.css\"></head><body><h1>Welcome to TechyAvi!!</h1><img src=\"Happy%20holi.gif\" alt=\"Autoplaying GIF\"></body></html>"; 
        });
    }
}
