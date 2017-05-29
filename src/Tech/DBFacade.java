package Tech;

import Domain.Customer;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Noah P on 24-04-2017.
 */
public class DBFacade {
    private String userName = "sa";
    private String password = "@Xx123456@";
    private String port = "1433";
    private String databaseName = "Flytteboxen";
    private Connection con;
    private PreparedStatement ps;
    private CallableStatement cl;

    public DBFacade() {

        openConnection();
    }

    /**
     * Open connection to the database
     */
    private void openConnection()  {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:"+port+";databaseName="+databaseName,userName,password);
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();

        }
    }

    public void sqlError(SQLException e){
        e.printStackTrace();
        System.exit(1);
    }



    /**
     * Makes prepared Statement
     * @param sql the SQL code for the prepared statement
     * @return the prepared statement
     * @throws SQLException
     */
    public PreparedStatement preparedStatement(String sql) throws SQLException {
        ps = con.prepareStatement(sql);

        return ps;
    }

    public CallableStatement callableStatement(String sql) throws SQLException {
        cl = con.prepareCall(sql);

        return cl;

    }

}