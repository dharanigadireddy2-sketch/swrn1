package com.instagram.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @GetMapping("/")
    public String feed() {
        return """
                <html>
                <head>
                    <title>Instagram Feed</title>
                    <style>
                        body { font-family: Arial; background:#fafafa; text-align:center; }
                        .post { background:white; width:400px; margin:20px auto; padding:10px; border:1px solid #ddd; }
                        img { width:100%; }
                        h3 { margin:5px 0; }
                    </style>
                </head>
                <body>
                    <h2>Instagram Feed</h2>

                    <div class='post'>
                        <h3>john_doe</h3>
                        <img src='https://via.placeholder.com/400'/>
                        <p>Beautiful sunset!</p>
                    </div>

                    <div class='post'>
                        <h3>jane_smith</h3>
                        <img src='https://via.placeholder.com/400'/>
                        <p>Coffee time ☕</p>
                    </div>

                </body>
                </html>
                """;
    }
}
