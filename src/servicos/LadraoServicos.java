package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.LadraoDAO;
import model.Ladrao;

public class LadraoServicos {

    LadraoDAO lDao = DAOFactory.getLadraoDAO();

    public void cadastrarLadrao(Ladrao lGO) {
        lDao.cadastrarLadrao(lGO);
    }

    public ArrayList<Ladrao> listaLadroes() {
        return lDao.getLadroes();
    }

    public Ladrao buscaLadraoByNome(String Nome) {
        return lDao.getLadraoByNome(Nome);
    }

    public void atualizarLadrao (Ladrao lVO) {
        lDao.atualizarLadrao(lVO);
    }

    public boolean deletarLadrao (int id) {
        return lDao.deletarLadrao(id);
    }
}
