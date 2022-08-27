package lambda_deneme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LambdaDosyaOkuma extends Methods {
    public static void main(String[] args) throws IOException {

        System.out.println("Siir Okuma 1. YOL");
        siirOkuma1();
        System.out.println("------------------");
        System.out.println("Siir Okuma 2. YOL");
        siirOkuma2();
        System.out.println("------------------");
        System.out.println("1. YOL");


        System.out.println("------------------");
        System.out.println("1. YOL");


        System.out.println("------------------");
        System.out.println("1. YOL");


        System.out.println("------------------");
        System.out.println("1. YOL");


    }

    public static void siirOkuma1() throws IOException {
        Path siir = Path.of("src/lambda_deneme/siirler.txt");
        Stream<String> akis = Files.lines(siir);
        akis.forEach(System.out::println);
    }

    public static void siirOkuma2() throws IOException {
        Files.lines(Path.of("src/lambda_deneme/siirler.txt")).forEach(System.out::println);
    }





}
