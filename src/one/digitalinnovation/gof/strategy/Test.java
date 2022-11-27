package one.digitalinnovation.gof.strategy;

public class Test {
    public static void main(String[] args) {

        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();


        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();

        // O robo pode andar de diferentes formas pq definimos um padrão de projeto que permite que exista essa variação de comportamentos de acordo com a estratégia(Normal/Agressivo/Defenssivo)
        //O Strategy usa bastante o polimorfismo visto o comportamento ser uma interface que implementa qualquer uma das classes derivadas dessa interface
    }
}
