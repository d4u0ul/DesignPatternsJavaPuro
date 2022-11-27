package one.digitalinnovation.gof.singleton;
/**
 * Singleton "apressado" - Um singleton que nna declaração já disponibiliza a instância para o usuário
 * @author d4u0ul
 */
public class SingletonEager {

    // minha instância, como que eu garanto que ninguém vai criar um outra instância? : Com um construtor privado
    private static SingletonEager instancia = new SingletonEager();; //no Eager na declaração da variável instancia já a inicializamos

    private SingletonEager() {
        super();
    }
    //mas como garantir que esse objeto possa ser chamado por alguém fora daqui? - com um método public estático que ativa o construtor
    //No eager a instância já tá pronta, não precisando verificar se ela existe ou não
    public static SingletonEager getInstancia(){
        return  instancia;
    }
}
