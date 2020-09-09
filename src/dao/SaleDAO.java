package dao;
//performing sql queryies on sale 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.SaleDetails;
import utility.ConnectionManager;

public class SaleDAO {
	//insert
	public void insertsale(SaleDetails saledetails) throws Exception
	{
		//int result=0;
		Connection con=ConnectionManager.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into rsale(name,place,city,cost,type,remarks)values(?,?,?,?,?,?)");
		ps.setString(1,saledetails.getName());
		ps.setString(2,saledetails.getPlace());
		ps.setString(3,saledetails.getCity());
		ps.setString(4,saledetails.getCost());
		ps.setString(5,saledetails.getType());
		ps.setString(6,saledetails.getRemarks());
		
		ps.executeQuery();
		con.close();
		
		
	}
	public List<SaleDetails> selectallsales() throws SQLException, Exception
	{
		Statement s=ConnectionManager.getConnection().createStatement(); 
		ResultSet r=s.executeQuery("select * from rsale" );
		List<SaleDetails> l=new ArrayList<SaleDetails>();
		while(r.next())
		{
			String name=r.getString("name");
			String place=r.getString("place");
			String city=r.getString("city");
			String cost=r.getString("cost");
			String type=r.getString("type");
			String remarks=r.getString("remarks");
			
			SaleDetails sd=new SaleDetails();
			sd.setName(name);
			sd.setPlace(place);
			sd.setCity(city);
			sd.setCost(cost);
			sd.setType(type);
			sd.setRemarks(remarks);
			l.add(sd);
			ConnectionManager.getConnection().close();
//			System.out.println("details are");
//			System.out.println(name +" "+ place+" "+city +" "+ cost+" " +type +" "+ remarks );
			
			
		}
		return l;
		
	}
	public void deletesale(String name) throws Exception
	{
		final String SQL = "DELETE from rsale where name = '"+name+"'";
		System.out.println(name);
		Connection con = ConnectionManager.getConnection();
		Statement st= con.createStatement();
//		System.out.println(st);
	
		st.executeQuery(SQL);

		con.commit();
		
	}
	public void updatesale(SaleDetails saledetails) throws Exception
	{
		
		final String sql="update  rsale set  place = '"+saledetails.getPlace()+"', city = '"+saledetails.getCity()+"' ,cost = '"+saledetails.getCost()+"',type = '"+saledetails.getType()+"',remarks = '"+saledetails.getRemarks()+"' where name = '"+saledetails.getName()+"'";
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement(); 
//		st.setString(1,saledetails.getPlace());
//		st.setString(2,saledetails.getCity());
//		st.setString(3,saledetails.getCost());
//		st.setString(4,saledetails.getType());
//		st.setString(5,saledetails.getRemarks());
//		st.setString(6,saledetails.getName());
		st.executeQuery(sql);
		con.commit();
	}
	
	
	
	
	
	public void selectbycity() throws Exception
	{
		Connection con=ConnectionManager.getConnection();
		String sql="select rusers.name,rusers.contact,rsale.city,rsale.remarks from rusers inner join rsale on rsale.city=rusers.city where rusers.city='mumbai'";
		PreparedStatement st=con.prepareStatement(sql);
		System.out.println("name");
		ResultSet r=st.executeQuery();
		System.out.println("name11111111");
		while(r.next())
		{
			System.out.println("name11111111");
			String name=r.getString("name");
			String contact=r.getString("contact");
			String city=r.getString("city");
			String remarks=r.getString("remarks");
			System.out.println("name: "+name+"contact: "+contact+"city: "+city+"remarks: "+remarks);
			
		}

		
	}
	

}
