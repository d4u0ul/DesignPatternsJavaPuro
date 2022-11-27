package one.digitalinnovation.gof.strategy;
/*
@author d4u0ul
padrão strategy designa a montagem de uma interface que concentre comportamentos de classes distintas como por exemplo um robô
se levarmos em consideração uma interface comportamento podemos definir um método mover que pode ser implementado de diversas maneiras(rápido, devagar, lentamente, silenciosamente, defensivo, agressivo)
 */
public interface Comportamento {
    void mover();

}
