package jdbc;
import java.sql.*;

class jdbc
{
     public static void main(String args[]) throws Exception
     {

      try{ 
            Class.forName("org.sqlite.JDBC");
           Connection con=DriverManager.getConnection("jdbc:sqlite:database/student_details.db");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from relationship_data");
           while(rs.next())
           {
             System.out.println(rs.getInt(1)+"\t"+
             rs.getString(2)+"\t"+
             rs.getString(3)+"\t");
           }
         rs.close();
        st.close();

        }
        catch (SQLException e) {
             System.out.println("<P>" + "There was an error doing the query:");
            System.out.println ("<PRE>" + e + "</PRE> \n <P>");
          }
 }
 }


