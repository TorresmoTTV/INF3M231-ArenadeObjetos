package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.VitimaDAO;
import model.Pessoa;

public class VitimaServicos {

    VitimaDAO vDao = DAOFactory.geVitimaDAO();

    public void cadastrarVitima(Pessoa vVO) {
        vDao.cadastrarVitima(vVO);
    }

    public ArrayList<Pessoa> listaVitimas() {
        return vDao.getVitimas();
    }
}
