package jdbc;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from product order by pname";
	private String insert_sql="insert into product values(?,?,?,?)";
	private String delete_sql="delete from product where pid=?";
	private String update_sql="update product set pqty=?,price=? where pid=?";
	public void updateData()
	{
		 try
		 {
		
		    Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		    //ESTABLISH THE CONNECTION
		    cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBSS","root","arindam");
		    ps=cn.prepareStatement(update_sql);
		    ps.setString(3,"P2");
		    ps.setDouble(1,25);
		    ps.setDouble(2,18000.00);
		    ps.executeUpdate();//store into table
		    
		 }
		 catch(ClassNotFoundException ce)
		 {
			 ce.printStackTrace();
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}
	public void deleteData()
	{
		 try
		 {
		
		    Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		    //ESTABLISH THE CONNECTION
		    cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBSS","root","arindam");
		    ps=cn.prepareStatement(delete_sql);
		    ps.setString(1,"P3");
		     ps.executeUpdate();//store into table
		    
		 }
		 catch(ClassNotFoundException ce)
		 {
			 ce.printStackTrace();
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}
	public void insertData()
	{
		 try
		 {
		
		    //Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		    //ESTABLISH THE CONNECTION
		    //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBSS","root","arindam");
			 ConnectionFactory con=new ConnectionFactory();
			    cn=con.getConn();
			 ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,"P3");
		    ps.setString(2,"MOBILE");
		    ps.setDouble(3,15);
		    ps.setDouble(4,15000.00);
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
	public void getData()
		{
		 try
		 {
		
		   // Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		    //ESTABLISH THE CONNECTION
		   // cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBSS","root","arindam");
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
			 st=cn.createStatement();//CREATE THE STATEMENT
		    //execute the query and store the date into resultset
		    rs=st.executeQuery(select_sql);
		    while(rs.next())
		    {
		    	//System.out.println(rs.getString(1));
		    	//System.out.println(rs.getString(2));
		    	//System.out.println(rs.getDouble(3));
		    	//System.out.println(rs.getDouble(4));
		    	System.out.println(rs.getString(1)+"==>"+rs.getString(2)+"===>"+rs.getDouble(3)+"===>"+rs.getDouble(4));
		    }
		 }
		 /*catch(ClassNotFoundException ce)
		 {
			 ce.printStackTrace();
		 }*/
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
	}
	
}
public class JavaMySQLConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestConnection ts=new TestConnection();
  //ts.insertData();
  //ts.getData();
  //ts.deleteData();
  //ts.updateData();
  ts.getData();
	}

}
