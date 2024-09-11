package dao;

public class DAOFactory {
    private static VitimaDAO vDao = new VitimaDAO();

    public static VitimaDAO getVitimaDAO() {
        return vDao;
    }

    private static GuerreiroDAO gDao = DAOFactory.getGuerreiroDAO();

    public static GuerreiroDAO getGuerreiroDAO() {
        return gDao;
    }
}
