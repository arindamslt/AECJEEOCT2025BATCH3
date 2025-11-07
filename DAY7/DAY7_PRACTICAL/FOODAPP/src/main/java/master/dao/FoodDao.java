package master.dao;
import java.sql.*;

import master.dto.foodDto;
import master.utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from food";
	private String insert_sql="insert into food values(?,?,?)";
	private String delete_sql="delete from food where fid=?";
	private String update_sql="update food set price=? where fid=?";
	private String search_sql="select * from food where fid=?";
	public ResultSet searchData(String fid)
	{
		 try
		 {
			 ConnectionFactory con=new ConnectionFactory();
			  cn=con.getConn();
			 ps=cn.prepareStatement(search_sql);
			 ps.setString(1, fid);
		     rs=ps.executeQuery();
					    
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
		 return rs;
	}
	public ResultSet getData()
	{
	 try
	 {
	
	    ConnectionFactory con=new ConnectionFactory();
	    cn=con.getConn();
		 st=cn.createStatement();//CREATE THE STATEMENT
	    //execute the query and store the date into resultset
	    rs=st.executeQuery(select_sql);
	   
	 }
	
	 catch(SQLException se)
	 {
		 se.printStackTrace();
	 }
	 return rs;
}


	public void deleteData(foodDto fdto)
	{
		 try
		 {
		
		    //Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		    //ESTABLISH THE CONNECTION
		    //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBSS","root","arindam");
			 ConnectionFactory con=new ConnectionFactory();
			    cn=con.getConn();
			 ps=cn.prepareStatement(delete_sql);
		    ps.setString(1,fdto.getFid());
		   
		   ps.executeUpdate();//store into table
		    
		 }
		
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}
	
	public void updateData(foodDto fdto)
	{
		 try
		 {
		
		    
			 ConnectionFactory con=new ConnectionFactory();
			    cn=con.getConn();
			 ps=cn.prepareStatement(update_sql);
		    ps.setString(2,fdto.getFid());
		 	 ps.setDouble(1,fdto.getPrice());
		   ps.executeUpdate();//store into table
		    
		 }
		
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}
	public void insertData(foodDto fdto)
	{
		 try
		 {
		
		    //Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		    //ESTABLISH THE CONNECTION
		    //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBSS","root","arindam");
			 ConnectionFactory con=new ConnectionFactory();
			    cn=con.getConn();
			 ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,fdto.getFid());
		    ps.setString(2,fdto.getFname());
		    ps.setDouble(3,fdto.getPrice());
		   ps.executeUpdate();//store into table
		    
		 }
		/* catch(ClassNotFoundException ce)
		 {
			 ce.printStackTrace();
		 }*/
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}
    
}
