
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RendezVousImplementation implements GestionCabinier<Rendez> {

    @Override
    public Rendez getT(int id) throws SQLException {
        String query = "SELECT * FROM rendezvous WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                return new Rendez(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4));
            }
        }
    }

    @Override
    public List<Rendez> getAllTs() throws SQLException {
        String query = "SELECT * FROM rendezvous";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            List<Rendez> rendezVousList = new ArrayList<>();
            while (rs.next()) {
                Rendez rendezVous = new Rendez(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4));
                rendezVousList.add(rendezVous);
            }
            return rendezVousList;
        }
    }



    @Override
    public void AddT(Rendez rendezVous) throws SQLException {
        String query = "INSERT INTO rendezvous (id, jour, id_Client, id_Creneau) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, rendezVous.getId());
            ps.setDate(2, new java.sql.Date(rendezVous.getJour().getTime()));
            ps.setInt(3, rendezVous.getId_Client());
            ps.setInt(4, rendezVous.getId_Creneau());
            ps.executeUpdate();
            System.out.println("RendezVous with id: " + rendezVous.getId() + " has been added.");
        }
    }

    @Override
    public void updateT(Rendez rendezVous, int id) throws SQLException {
        String query = "UPDATE rendezvous SET jour = ?, id_Client = ?, id_Creneau = ? WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setDate(1, new java.sql.Date(rendezVous.getJour().getTime()));
            ps.setInt(2, rendezVous.getId_Client());
            ps.setInt(3, rendezVous.getId_Creneau());
            ps.setInt(4, id);
            ps.executeUpdate();
            System.out.println("RendezVous with id: " + id + " has been updated.");
        }
    }

    @Override
    public void deleteT(int id) throws SQLException {
        String query = "DELETE FROM rendezvous WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("RendezVous with id: " + id + " has been deleted.");
        }
    }
}
