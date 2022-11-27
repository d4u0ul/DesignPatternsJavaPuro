package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso" - Um singleton que num primeiro momento não disponibiliza a instância para o usuário
 * @author d4u0ul
 */
public class SingletonLazy {
    private static SingletonLazy instancia; // minha instância, como que eu garanto que ninguém vai criar um outra instância? : Com um construtor privado

    private SingletonLazy() {
        super();
    }
    //mas como garantir que esse objeto possa ser chamado por alguém fora daqui? - com um método public estático que ativa o construtor
    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return  instancia;
    }
}
