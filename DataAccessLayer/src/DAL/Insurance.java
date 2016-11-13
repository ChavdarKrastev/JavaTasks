package DAL;

import insurance.SocialInsuranceRecord;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Stack;
import personaldetails.Citizen;

public class Insurance {

    public static ArrayList<SocialInsuranceRecord> getInsurance(int id) throws SQLException {
        SocialInsuranceRecord sir = null;
        ArrayList<SocialInsuranceRecord> arrSir = new ArrayList();
        //ResultSet rs = null;

        String sqlquery = "SELECT * FROM personcharacteristics.insurance "
                + "where personID = ?";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sqlquery)) {
            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                  
                   sir = new SocialInsuranceRecord(rs.getInt(2), rs.getInt(3), rs.getDouble(4));
                   arrSir.add(sir);
                
            }
        } catch (SQLException ex) {
 
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }

        }
        return arrSir;
    }
    }
    static void insertInsurance(int year, int month, double amount, int personID) {
        String sqlquery = "INSERT INTO personcharacteristics.insurance "
                + "(year, month, amount, personID)"
                + "VALUES (?,?,?,?)";
        
        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
               PreparedStatement statement = con.prepareStatement(sqlquery)) {
			
	statement.setInt(1, year);


           
            statement.setInt(2, month);
            
            statement.setDouble(3, amount);
            statement.setInt(4, personID);

            //statement.registerOutParameter(5, java.sql.Types.INTEGER);
            
            statement.execute();

           // i = statement.getInt("new_id");
            
        } catch (SQLException ex) {

            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }

        }
        
    }

    static final String DBMS_CONN_STRING = "jdbc:mysql://localhost:3306/personcharacteristics?zeroDateTimeBehavior=convertToNull";
    static final String DBMS_USERNAME = "root";
    static final String DBMS_PASSWORD = "123456";

    public static void main(String[] args) throws SQLException {

        //insertInsurance(2014,10,27.44,1);
//        if (getInsurance(1) == null) {
//            System.out.println("sir is null");
//        } else {

for (int i = 0 ;i<getInsurance(1).size();i++)
{
    System.out.println(getInsurance(1).get(i).getMonth()+" "+getInsurance(1).get(i).getYear()+ " "+getInsurance(1).get(i).getAmount());
}
        //System.out.println();
        
       // System.out.println(getInsurance(1).getYear() +" "+getInsurance(1).getMonth()+" "+getInsurance(1).getAmount());
        //System.out.println(getInsurance(1).getYear());

//Person p1 = new Person();
//
//int pid = p1.insertPerson("Ivo", "Sakov", "todov", "M", "177", "21.02.1988");
//System.out.println(pid);
//
//Education e1 = new Education();
//e1.insertEducation("12.09.2000", "12.09.2004","TU-Sofia", "4.89", "M", pid);
//
//insertInsurance(2016,10,122.172,pid);

//System.out.println(iid);


//System.out.println(Person.getPersonDetails(7).getFirstName() +" "+ Person.getPersonDetails(7).getLastName());

    }
}
