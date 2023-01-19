package DAO;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class imp1 implements IPresonne {


    @Override
    public void addPersonne(Personne p) throws SQLException {
        String Query = "insert into data(nom , prenom , num) values (? ,? , ?)";
        PreparedStatement ps = Connections.getCon().prepareStatement(Query);
        ps.setString(1 ,p.getNom());
        ps.setString(2, p.getPrenom());
        ps.setInt(3, p.getNum());
        ps.executeUpdate();
        System.out.println("Added successfully !");
    }

    @Override
    public void updatePersonne(Personne p , int idp) throws SQLException {
        String Query = "update data set nom=? , prenom=? , num=? where num=?";
        PreparedStatement ps = Connections.getCon().prepareStatement(Query);
        ps.setString(1 ,p.getNom());
        ps.setString(2, p.getPrenom());
        ps.setInt(3, p.getNum());
        ps.setInt(4, idp);

        ps.executeUpdate();
        System.out.println("Updated successfully !");
    }

    @Override
    public void deletePersonne(int id) throws SQLException {
        String Query ="delete from data where num=?";
        PreparedStatement ps = Connections.getCon().prepareStatement(Query);
        ps.setInt(1 ,id);
        ps.executeUpdate();
        System.out.println("Deleted successfully !");
    }

    @Override
    public Personne getPersonne(int id) throws SQLException {
        String Query = "select * from data where num=?";
        PreparedStatement ps = Connections.getCon().prepareStatement(Query);
        ps.setInt(1, id);
       ResultSet rs =  ps.executeQuery();
        rs.next();
       Personne p = new Personne(rs.getString(1), rs.getString(2), rs.getInt(3));
       return p;
    }

    @Override
    public List<Personne> getPersonnes() throws SQLException {
        String Query = "select * from data";
        PreparedStatement ps = Connections.getCon().prepareStatement(Query);
        ResultSet rs = ps.executeQuery();
        List<Personne> LP = new ArrayList<>();


        while (rs.next()) {
            Personne  p = new Personne(rs.getString(1), rs.getString(2), rs.getInt(3));
            LP.add(p);
        }
        return LP;
    }
}
