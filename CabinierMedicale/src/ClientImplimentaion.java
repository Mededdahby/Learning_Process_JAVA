
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientImplimentaion implements GestionCabinier<Clients> {
    @Override
    public Clients getT(int id) throws SQLException {
        String Query = "select * from clients where id =?";
        PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        Clients c = new Clients(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4) );
        return c;
    }


    @Override
    public List<Clients> getAllTs() throws SQLException {
        String Query = "select * from clients";
        try (PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
            ResultSet rs = ps.executeQuery()) {
            List<Clients> ls = new ArrayList<>();
            while(rs.next()){
                Clients c = new Clients(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4) );
                ls.add(c);
            }
            return ls;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }


    @Override
    public void AddT(Clients p) throws SQLException {
        String Query = "insert into clients (id , titre , nom , prenom) values (?,?,?,?)";
        PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
        ps.setInt(1, p.getId() );
        ps.setString(2, p.getTitre() );
        ps.setString(3, p.getNom() );
        ps.setString(4, p.getPrenom() );
        ps.executeUpdate();
        System.out.println("Le client avec le nom : "+ p.getNom() +" est ajouté ");
    }

    @Override
    public void updateT(Clients p, int id) throws SQLException {
        String Query = "update clients set  titre=? , nom=? , prenom=? where id =?";
        PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
        ps.setString(1, p.getTitre() );
        ps.setString(2, p.getNom() );
        ps.setString(3, p.getPrenom() );
        ps.setInt(4, id );
        int done = ps.executeUpdate();
if(done >0){
        System.out.println("Le client  : "+ p.getId() +" à été  modifier ");}
    else{
        System.out.println("Le client  : "+ p.getId() +" à pas été  modifier ");
    }

    }

    @Override
    public void deleteT(int id) throws SQLException {
        String Query = "delete from clients where id =?";
        PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
        ps.setInt(1, id );

        ps.executeUpdate();
        System.out.println("Le client  : "+ id +" à été  supprimé ");
    }

    public void getRendez(int nom) throws SQLException {
        String Query = "select c.nom , c.titre , c.prenom , jour from clients c , renderzvous r where r.id_client = c.id and c.id =?";
        PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
        ps.setInt(1, nom );
        ResultSet rs = ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4));
    }
    public void getMeddecine(int nom) throws SQLException {
        String Query = "select m.nom , m.titre , m.prenom  from clients c , renderzvous r , creneaux ce , medecins m  where r.id_client = c.id and r.id_creneau =ce.id and ce.id_medecine = m.id and c.id =?";
        PreparedStatement ps = Connections.getConnection().prepareStatement(Query);
        ps.setInt(1, nom );
        ResultSet rs = ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3));
    }
}
