package vowelFinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VowelFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(VowelFinderApplication.class, args);

        String text = "java to czy sen";
        String text2;
        System.out.println(text);
        text2=text.replaceAll("[^aeiou]", " ");
        System.out.println(text2);


    }

}
