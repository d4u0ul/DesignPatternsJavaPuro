package subsistema1.crm;
//Camada fake de servicços do CRM
public class CrmService {

    private CrmService(){
        // evitando que essa classe possa ser inicializada
        super();
    }
    //interface mais amigável para um outro sistema consumir
    public static void gravarCliente(String nome,String cep,String estado,String cidade){
        System.out.println("Gravando os dados do cliente: "+ nome + " cep: "+ cep +" estado: "+estado+" cidade: "+cidade);
    }
}
