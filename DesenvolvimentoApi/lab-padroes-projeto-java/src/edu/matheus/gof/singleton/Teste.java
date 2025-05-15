package edu.matheus.gof.singleton;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstancia();
        System.out.println(singletonLazy2);

        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        SingletonEager singletonEager2 = SingletonEager.getInstancia();
        System.out.println(singletonEager2);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder2);
    }
}
