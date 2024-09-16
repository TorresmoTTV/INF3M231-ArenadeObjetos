package dao;

public class DAOFactory {
    private static VitimaDAO vDao = new VitimaDAO();
    private static GuerreiroDAO gDao = new GuerreiroDAO();
    private static LadraoDAO lDao = new LadraoDAO();

    public static VitimaDAO getVitimaDAO() {
        return vDao;
    }

    public static GuerreiroDAO getGuerreiroDAO() {
        return gDao;
    }

    public static LadraoDAO getLadraoDAO() {
        return lDao;
    }

}
