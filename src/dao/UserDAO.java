package dao;
//performing sql queries on user part
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.UserDetails;
import utility.ConnectionManager;

public class UserDAO{
	
	public int signUp(UserDetails user) throws Exception  
	{
		
			Connection con = ConnectionManager.getConnection();
			String sql="insert into RUSERS(name,email,password,contact,city,gender)values(?,?,?,?,?,?)";
			//String sql="insert into RUSERS1(name,email,password)values(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,user.getName());
			st.setString(2,user.getEmail());
			st.setString(3, user.getPassword());
			st.setString(4, user.getContact());
			st.setString(5, user.getCity());
			st.setString(6, user.getGender());
			int i=st.executeUpdate();
			con.close();
			return i;
		
		
		
		
	}
	public boolean loginUser(UserDetails user) throws Exception {
		//boolean status = false;
		try {
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from RUSERS where name = ? and password = ? ");

			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPassword());
			//	System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			//status = rs.next();
			return true;
		} catch (SQLException e) {
			System.out.println(e);
		}
		return false;
	}
//	public boolean loginUser(UserDetails user) throws Exception
//	{
//			Connection con = ConnectionManager.getConnection();
//			String sql="select * from RUSERS ";
//			PreparedStatement st = con.prepareStatement(sql);
//			ResultSet rs = st.executeQuery(sql);
//			String name=user.getName();
//			String password=user.getPassword();
//			System.out.println(name);
//			System.out.println(password);
//			while(rs.next())
//			{
//				
//				System.out.println(rs.getString(1)+" "+rs.getString(3)); 
//				if(name.equalsIgnoreCase(rs.getString(1)))//its only going into the loop when 3  && password.equals(rs.getString(3)
//				{
//					
//					System.out.println("done"); 
//					return true;
//				
//				}
//				
//			}// ill show once sir 
//	
//		return false;
//		
//	
//	}
//System.out.println("name done");
//if( password.equals(rs.getString("password"))) 
//{
//}
	

	
	

}
