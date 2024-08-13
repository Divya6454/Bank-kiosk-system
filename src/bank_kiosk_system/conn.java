package bank_kiosk_system;

import java.sql.*; 
public class conn {
 Connection connection;
 Statement s;
    public conn() {
        
        connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankkiosksystem","root","yes2005");
            s = connection.createStatement();
            System.out.println("Connection successful");
        }catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

//public class conn {
//    
//        public void getSQLQuery(String sql){
//            Connection connection = null;
//		try {
//			// below two lines are used for connectivity.
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/bankkiosksystem",
//				"root", "yes2005");
//
//			// mydb is database
//			// mydbuser is name of database
//			// mydbuser is password of database
//                        
//                        PreparedStatement preparedStmt = conn.prepareStatement(sql);
//                        preparedStmt.setString (1, "Barney");
//                        preparedStmt.setString (2, "Rubble");
//                        preparedStmt.setDate   (3, startDate);
//                        preparedStmt.setBoolean(4, false);
//                        preparedStmt.setInt    (5, 5000);
//
//      // execute the preparedstatement
//      preparedStmt.execute();
//
//			Statement statement;
////			statement = connection.createStatement();
////			ResultSet resultSet;
////			resultSet = statement.executeQuery(sql);
////			int code;
////			String title;
////			while (resultSet.next()) {
////				code = resultSet.getInt("Acc_no");
////				title = resultSet.getString("Name").trim();
////				System.out.println("Code : " + code
////								+ " Title : " + title);
////			}
//                        
//			resultSet.close();
//			statement.close();
//			connection.close();
//		}
//		catch (Exception exception) {
//			System.out.println(exception);
//		}
//        }
//    
//	public static void main(String arg[])
//	{
//		Connection connection = null;
//		try {
//			// below two lines are used for connectivity.
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/bankkiosksystem",
//				"root", "yes2005");
//
//			// mydb is database
//			// mydbuser is name of database
//			// mydbuser is password of database
//
//			Statement statement;
//			statement = connection.createStatement();
//			ResultSet resultSet;
//			resultSet = statement.executeQuery(
//				"select * from account");
//			int code;
//			String title;
//			while (resultSet.next()) {
//				code = resultSet.getInt("Acc_no");
//				title = resultSet.getString("Name").trim();
//				System.out.println("Code : " + code
//								+ " Title : " + title);
//			}
//			resultSet.close();
//			statement.close();
//			connection.close();
//		}
//		catch (Exception exception) {
//			System.out.println(exception);
//		}
//	} // function ends
//} // class ends