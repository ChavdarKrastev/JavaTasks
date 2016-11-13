package DAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Education {

    static final String DBMS_CONN_STRING = "jdbc:mysql://localhost:3306/personcharacteristics?zeroDateTimeBehavior=convertToNull";
    static final String DBMS_USERNAME = "root";
    static final String DBMS_PASSWORD = "123456";

    public void insertEducation(String enrollmentDate, String graduationDate, String institutionName,
            String finalGrade, String degree, int PersonID) {
        String sqlquery = "INSERT INTO personcharacteristics.education "
                + "(enrollmentDate, graduationDate, institutionName, finalGrade, degree, PersonID)"
                + "VALUES (?,?,?,?,?,?)";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sqlquery)) {

            final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            final LocalDate enrollment = LocalDate.parse(enrollmentDate, formatter);

            statement.setDate(1, java.sql.Date.valueOf(enrollment));

            final LocalDate graduation = LocalDate.parse(graduationDate, formatter);

            statement.setDate(2, java.sql.Date.valueOf(graduation));

            statement.setString(3, institutionName);

            double grade = Double.parseDouble(finalGrade);

            statement.setDouble(4, grade);

            statement.setString(5, degree);

            statement.setInt(6, PersonID);

            statement.execute();

        } catch (SQLException ex) {

            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }
}
