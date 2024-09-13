package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.VitimaDAO;
import model.Pessoa;

public class VitimaServicos {

    VitimaDAO vDao = DAOFactory.getVitimaDAO();

    public void cadastrarVitima(Pessoa vVO) {
        vDao.cadastrarVitima(vVO);
    }

    public ArrayList<Pessoa> listaVitimas() {
        return vDao.getVitimas();
    }

    public Pessoa buscaVitimaByNome(String Nome) {
        return vDao.getVitimaByNome(Nome);
    }

    public void atualizaVitima(Pessoa vVO) {
        vDao.atualizarVitima(vVO);
    }

    public boolean deletarVitima(int id) {
        return vDao.deletarVitima(id);
    }
}
