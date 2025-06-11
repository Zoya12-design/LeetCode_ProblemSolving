import java.sql.*;

public class dbms{
    public static void main(String args[]) throws Exception {
        // Step 1: Load UCanAccess driver
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        // Step 2: Prepare data for establishing connection with database
        String dbName = "D:/StudentManagement.accdb"; // <-- yahan apne file ka actual path dena
        String dbUrl = "jdbc:ucanaccess://" + dbName;

        // Step 3: Create Connection object using prepared connection data
        Connection con = DriverManager.getConnection(dbUrl);

        // Step 4: Prepare a query and statement object to execute the query
        String query = "SELECT * FROM Students";
        Statement stmt = con.createStatement();

        // Step 5: Execute a query using executeQuery() method
        ResultSet resourceHandle = stmt.executeQuery(query);
        while (resourceHandle.next()) {
            System.out.print(resourceHandle.getInt(1) + "\t");       // ID
            System.out.print(resourceHandle.getString(2) + "\t");    // Name
            System.out.print(resourceHandle.getInt(3) + "\t");       // Age
            System.out.println(resourceHandle.getString(4));         // Department
        }

        // Step 6: Release the occupied resources
        resourceHandle.close();
        stmt.close();
        con.close();
    }
}
