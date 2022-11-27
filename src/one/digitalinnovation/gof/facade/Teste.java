package one.digitalinnovation.gof.facade;

public class Teste {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("adauto", "123456789"); //Interface simples que abstrai a complexidade de integração com a API de CEP e depois grave o cliente no subsistema CRM
    }
}
