package one.digitalinnovation.gof.strategy;

public class Robo {
    //contexto - Robo que se move de diversas maneiras
    private Comportamento comportamento;

    // O robo pode querer mudar de estratégia
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void mover(){
        comportamento.mover();
    }
}
