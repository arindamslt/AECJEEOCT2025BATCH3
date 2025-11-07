package master.dao;
import  java.sql.*;

import master.dto.RegisterDto;
import master.utilities.ConnectionFactory;
public class RegisterDao {
	private Connection cn=null;
	//private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	//private String select_sql="select * from register";
	private String insert_sql="insert into register values(?,?,?)";
	private String check_sql="select * from register where uname=? and pass=?";
	public boolean checkLogin(String uname,String pass)
	{
		boolean flag=false;
		 try
		 {
			 ConnectionFactory con=new ConnectionFactory();
			  cn=con.getConn();
			 ps=cn.prepareStatement(check_sql);
			 ps.setString(1, uname);
			 ps.setString(2, pass);
		     rs=ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
		 return flag;
	}
	public void insertData(RegisterDto fdto)
	{
		 try
		 {
			 	 ConnectionFactory con=new ConnectionFactory();
			    cn=con.getConn();
			 ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,fdto.getUname());
		    ps.setString(2,fdto.getPass());
		    ps.setString(3,fdto.getNm());
		   ps.executeUpdate();//store into table
		    
		 }
		
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}

}
