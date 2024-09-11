package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.GuerreiroDAO;
import model.Guerreiro;

public class GuerreiroServicos {

    GuerreiroDAO gDao = DAOFactory.getGuerreiroDAO();

    public void cadastrarGuerreiro(Guerreiro vGO) {
        gDao.cadastrarGuerreiro(vGO);
    }

    public ArrayList<Guerreiro> listaGuerreiros() {
        return gDao.getGuerreiros();
    }

    public Guerreiro buscaGuerreiroByNome(String Nome) {
        return gDao.getGuerreiroByNome(Nome);
    }
}
