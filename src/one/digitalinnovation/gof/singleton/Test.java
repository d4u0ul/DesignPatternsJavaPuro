package one.digitalinnovation.gof.singleton;

/*
@autor d4u0ul
@brief - testes com Singleton
 */
public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia(); // não consegue dar new-> Construtor privado
        System.out.println("o endereço de memória é o: "+ lazy);
        lazy = SingletonLazy.getInstancia(); // mesmo instanciando de novo o objeto é o mesmo de acordo com o endereço usado na mem
        System.out.println("o endereço de memória é o: "+ lazy);

        SingletonEager eager = SingletonEager.getInstancia(); // não consegue dar new-> Construtor privado
        System.out.println("o endereço de memória é o: "+ eager);
        eager = SingletonEager.getInstancia(); // não consegue dar new-> Construtor privado
        System.out.println("o endereço de memória é o: "+ eager);


        SingletonLazyHolder lazyHolder  = SingletonLazyHolder.getInstancia(); // não consegue dar new-> Construtor privado
        System.out.println("o endereço de memória é o: "+ lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia(); // não consegue dar new-> Construtor privado
        System.out.println("o endereço de memória é o: "+ lazyHolder);
    }
}
