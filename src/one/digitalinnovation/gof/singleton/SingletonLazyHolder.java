package one.digitalinnovation.gof.singleton;
/**
 * Singleton "regulador de preguiça" - Um singleton que tem um consumo de memória mais otimizado - encapsula a instânci aem uma classe estática interna (inner class) chamada holder
 * @author d4u0ul
 * @see <a href="https://stackoverflow.com/a/24018148">Referência de lazyHolder</a>
 */
public class SingletonLazyHolder {

    private static class Holder{
        //class com a única funcão de encapsular a instância e ser threadsafe
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();; //a  instância agora deve ser pública
    }


    private SingletonLazyHolder() {
        super();
    }
    //mas como garantir que esse objeto possa ser chamado por alguém fora daqui? - com um método public estático que ativa o construtor
    //No eager a instância já tá pronta, não precisando verificar se ela existe ou não
    public static SingletonLazyHolder getInstancia(){
        return  Holder.instancia;
    }
}
