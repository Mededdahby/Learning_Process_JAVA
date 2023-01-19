
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreneauxImplementation  implements GestionCabinier<Creneaux>{
    @Override
    public Creneaux getT(int id) throws SQLException {
        String query = "SELECT * FROM creneaux WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                return new Creneaux(rs.getInt(1), rs.getInt(2) ,rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),rs.getInt(7));
            }
        }
    }

    @Override
    public List<Creneaux> getAllTs() throws SQLException {
        String query = "SELECT * FROM creneaux";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            List<Creneaux> creneauxList = new ArrayList<>();
            while (rs.next()) {
                Creneaux creneaux = new Creneaux(rs.getInt(1), rs.getInt(2) ,rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),rs.getInt(7));
                creneauxList.add(creneaux);
            }
            return creneauxList;
        }
    }

    @Override
    public void AddT(Creneaux creneaux) throws SQLException {
        String query = "INSERT INTO creneaux (id,version, hDebut, mDebut, mFin, hFin, id_Medecin) VALUES (?,?, ?,?,?, ?, ?)";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, creneaux.getId());
            ps.setInt(2, creneaux.getId());
            ps.setInt(3, creneaux.getId());
            ps.setInt(4, creneaux.getId());
            ps.setInt(5, creneaux.getId());
            ps.setInt(6, creneaux.getId());
            ps.setInt(7, creneaux.getId());
            ps.executeUpdate();
            System.out.println("Creneaux with Id: " + creneaux.getId() + " has been added.");
        }
    }

    @Override
    public void updateT(Creneaux creneaux, int id) throws SQLException {
        String query = "UPDATE creneaux SET version=?, hDebut=?, mDebut=?, mFin=?, hFin=?, id_Medecin=? WHERE id = ? ";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, creneaux.getId());
            ps.setInt(2, creneaux.getId());
            ps.setInt(3, creneaux.getId());
            ps.setInt(4, creneaux.getId());
            ps.setInt(5, creneaux.getId());
            ps.setInt(6, creneaux.getId());
            ps.setInt(7, id);
            ps.executeUpdate();
            System.out.println("Creneaux with id: " + id + " has been updated.");
        }
    }

    @Override
    public void deleteT(int id) throws SQLException {
        String query = "DELETE FROM creneaux WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Creneaux with id: " + id + " has been deleted.");
        }
    }

}
