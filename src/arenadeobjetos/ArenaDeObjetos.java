package arenadeobjetos;

import model.Pessoa;

public class ArenaDeObjetos {
    public static void main(String[] args) {

        Pessoa vitima = new Pessoa("Vitima 1", "Castanho", "Castanho Claro", "Branca", true);
        System.out.println("Vitima:\n" + vitima.toString());
        System.out.println("Perdeu 25 pontos de vida");
        int pvAtual = vitima.getPontosDeVida();
        vitima.setPontosDeVida(pvAtual - 25);
        System.out.println("Vitima:\n" + vitima.toString());
        System.out.println("Perdeu 30 pontos de vida");
        vitima.dano(30);
        System.out.println("Vitima:\n" + vitima.toString());
    }

}
