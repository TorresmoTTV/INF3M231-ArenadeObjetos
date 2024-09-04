package model;

public class Ladrao extends Pessoa {
    private String planoDeFuga;

    public Ladrao() {
    }

    public Ladrao(String nome, String cabelo, String olho, String pele, boolean sexo, String planoDeFuga) {
        super(nome, cabelo, olho, pele, sexo);
        this.planoDeFuga = planoDeFuga;
    }

    public String getPlanoDeFuga() {
        return planoDeFuga;
    }

    public void setPlanoDeFuga(String planoDeFuga) {
        this.planoDeFuga = planoDeFuga;
    }

    public String fugir() {
        return "Da no pé!";
    }

    public String roubar() {
        return "Arrastão";
    }

    @Override
    public String toString() {
        return "Ladrao [planoDeFuga=" + planoDeFuga + ", getPlanoDeFuga()=" + getPlanoDeFuga() + ", getNome()="
                + getNome() + ", getCabelo()=" + getCabelo() + ", getOlho()=" + getOlho() + ", getPele()=" + getPele()
                + ", isSexo()=" + isSexo() + ", getPontosDeVida()=" + getPontosDeVida() + "]";
    }

}
