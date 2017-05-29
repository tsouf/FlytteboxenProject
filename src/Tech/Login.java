package Tech;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by Noah P on 24-04-2017.
 */
public class Login{
    private DBFacade dbFacade = new DBFacade();
    private int userID;

    public Login() {}

    /**
     * Check if the user exist in the database
     * @param userID the username of the user
     * @return true or false if the user exist
     */
    public boolean login(String userID) {
        try {

            CallableStatement cl = dbFacade.callableStatement("{call loginUser(?)}");

            cl.setString(1, userID);

            ResultSet rs = cl.executeQuery();

            if(rs.next()) {
                this.userID = rs.getInt("employee_ID");
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    /**
     * Get the userID
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }
}