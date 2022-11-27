package one.digitalinnovation.gof.facade;
//Imagine que vc tem uma base de clientes e vc quer passar para uma base atual e vc quer consumir uma api de CEP para que a partir do CEP que vc já tem, vc possa complementar com mais ifnormações relacionadas ao endereço como cidade, rua...

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
