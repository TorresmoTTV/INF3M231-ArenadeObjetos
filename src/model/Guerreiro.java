package model;

public class Guerreiro extends Pessoa {
    private String armamento;

    public Guerreiro() {
    }

    public Guerreiro(String nome, String cabelo, String olho, String pele, boolean sexo, String armamento) {
        super(nome, cabelo, olho, pele, sexo);
        this.armamento = armamento;
    }

}
