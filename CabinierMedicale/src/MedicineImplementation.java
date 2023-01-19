import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicineImplementation implements GestionCabinier<Medicine> {

    @Override
    public Medicine getT(int id) throws SQLException {
        String query = "SELECT * FROM medecins WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                return new Medicine(rs.getInt(1), rs.getInt(2),rs.getString(3), rs.getString(4), rs.getString(5));
            }
        }
    }

    @Override
    public List<Medicine> getAllTs() throws SQLException {
        String query = "SELECT * FROM medecins";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            List<Medicine> medicineList = new ArrayList<>();
            while (rs.next()) {
                Medicine medicine =   new Medicine(rs.getInt(1), rs.getInt(2),rs.getString(3), rs.getString(4), rs.getString(5));
                medicineList.add(medicine);
            }
            return medicineList;
        }
    }

    @Override
    public void AddT(Medicine medicine) throws SQLException {
        String query = "INSERT INTO medecins (id,version, titre, nom, prenom) VALUES (?,?, ?, ?, ?)";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, medicine.getId());
            ps.setInt(2, medicine.getId());
            ps.setString(3, medicine.getTitre());
            ps.setString(4, medicine.getNom());
            ps.setString(5, medicine.getPrenom());
            ps.executeUpdate();
            System.out.println("Medicine with name: " + medicine.getNom() + " has been added.");
        }
    }

    @Override
    public void updateT(Medicine medicine, int id) throws SQLException {
        String query = "UPDATE medecins SET version= ?,titre = ?, nom = ?, prenom = ? WHERE id = ? ";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
           ps.setInt(1, medicine.getVersion());
            ps.setString(2, medicine.getTitre());
            ps.setString(3, medicine.getNom());
            ps.setString(4, medicine.getPrenom());
            ps.setInt(5, id);
            ps.executeUpdate();
            System.out.println("Medicine with id: " + id + " has been updated.");
        }
    }

    @Override
    public void deleteT(int id) throws SQLException {
        String query = "DELETE FROM medecins WHERE id = ?";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Medicine with id: " + id + " has been deleted.");
        }
    }


    }

