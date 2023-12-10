package com.example.vowelfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VowelFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(VowelFinderApplication.class, args);

        String text = "java to czy sen";
        String text2;
        System.out.println(text);
        text2=text.replace("b","").replace("c","").replace("d","").replace("f","").replace("g","").replace("h","").replace("j","").replace("k","").replace("l","").replace("m","").replace("n","").replace("p","").replace("r","").replace("s","").replace("t","").replace("w","").replace("y","").replace("z","").replace("B","").replace("C","").replace("D","").replace("F","").replace("G","").replace("H","").replace("J","").replace("K","").replace("L","").replace("M","").replace("N","").replace("P","").replace("R","").replace("S","").replace("T","").replace("W","").replace("Y","").replace("Z","");;

        System.out.println(text2);


    }

}
