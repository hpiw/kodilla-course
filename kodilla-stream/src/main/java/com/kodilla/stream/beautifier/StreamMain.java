package com.kodilla.stream.beautifier;

public class StreamMain {public static void main(String[] args) {
    PoemBeautifier poemBeautifier = new PoemBeautifier();


    poemBeautifier.beautify("ABC Alpha and Omega", text -> "ABC" + text + "ABC");
    poemBeautifier.beautify("String to upper case", String::toUpperCase);
    poemBeautifier.beautify("Alergic to y", text -> text.replace("y", ""));
    poemBeautifier.beautify("Distance extender", text -> text.replaceAll(" ", "  "));
}
}
