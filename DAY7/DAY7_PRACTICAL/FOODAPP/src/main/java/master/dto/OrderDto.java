package master.dto;

import java.util.Date;

public class OrderDto {
private int oid;
private String fid;
private Date odt;
private Double oqty;
private String uname;
public OrderDto() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderDto(int oid, String fid, Date odt, Double oqty, String uname) {
	super();
	this.oid = oid;
	this.fid = fid;
	this.odt = odt;
	this.oqty = oqty;
	this.uname = uname;
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public Date getOdt() {
	return odt;
}
public void setOdt(Date odt) {
	this.odt = odt;
}
public Double getOqty() {
	return oqty;
}
public void setOqty(Double oqty) {
	this.oqty = oqty;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}

}
