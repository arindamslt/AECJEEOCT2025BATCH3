package master.dto;

public class foodDto {
private String fid;
private String fname;
private Double price;
public foodDto() {
	super();
	// TODO Auto-generated constructor stub
}
public foodDto(String fid, String fname, Double price) {
	super();
	this.fid = fid;
	this.fname = fname;
	this.price = price;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
