
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LOC
 */
public class ConfigDB {
    private final String DB_DRIVER = "${driver}";
    private final String DB_URL = "${url}";
    private final String DB_USER = "${user}";
    private final String DB_PASS = "${pass}";
    
    protected Connection cnn = null;
    protected ResultSet rs = null;

    public ConfigDB() {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConfigDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected final Connection openConnection(){
        try {
            cnn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException ex) {
            Logger.getLogger(ConfigDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
    }
    protected final void closeConnection(){
        try {
            if(rs!=null){
                rs.close();
            }
            if(cnn!=null){
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConfigDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

