package master.dao;
import java.sql.*;

import master.dto.OrderDto;

import master.utilities.ConnectionFactory;
public class OrderDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from billing where uname=?";
	private String insert_sql="insert into orderdtls(fid,oqty,uname) values(?,?,?)";
	public ResultSet billing(String uname)
	{
		 try
		 {
			 ConnectionFactory con=new ConnectionFactory();
			  cn=con.getConn();
			 ps=cn.prepareStatement(select_sql);
			 ps.setString(1, uname);
		     rs=ps.executeQuery();
					    
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
		 return rs;
	}
	public void insertData(OrderDto fdto)
	{
		 try
		 {
			 ConnectionFactory con=new ConnectionFactory();
			   cn=con.getConn();
			 ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,fdto.getFid());
		    ps.setDouble(2,fdto.getOqty());
		    ps.setString(3,fdto.getUname());
		    ps.executeUpdate();//store into table
		    
		 }
	
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}

}
