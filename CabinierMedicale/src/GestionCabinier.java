

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface GestionCabinier<T> {

    T getT(int id) throws SQLException, IOException;

    List<T> getAllTs() throws SQLException, IOException;
    
    void AddT(T p) throws SQLException;
    
    void updateT (T p, int id) throws SQLException, IOException;
    
    void deleteT(int id) throws SQLException, IOException;
}
