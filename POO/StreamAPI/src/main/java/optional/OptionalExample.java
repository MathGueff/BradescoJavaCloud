package main.java.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);

        Optional<String> optionalValueComConsumer = Optional.of("Hello");
        optionalValueComConsumer.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}
