package DAO;

import java.sql.SQLException;
import java.util.List;

public interface    IPresonne {
    void addPersonne(DAO.Personne p) throws SQLException;

    void updatePersonne(DAO.Personne p, int id) throws SQLException;
    void deletePersonne(int id) throws SQLException;

   DAO.Personne getPersonne(int id) throws SQLException;
    List<DAO.Personne> getPersonnes() throws SQLException;
}
