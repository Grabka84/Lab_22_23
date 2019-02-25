package co.grandcircus.lab.Coffee_Shop.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fname; // first name
	private String lname; // last name
	private String pnum; // phone number
	private String uemail; // user email
	private String uyear; // user year 
	private String gender; // gender
	private String access; // modifier for admin access, true if admin, false if not
	
	// Constructors
	public Users() {}

	public Users(Long id, String fname, String lname, String pnum, String uemail, String uyear, String gender, String access) {
		setId(id);
		setFname(fname);
		setLname(lname);
		setPnum(pnum);
		setUemail(uemail);
		setUyear(uyear);
		setGender(gender);
		setAccess(access);
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUyear() {
		return uyear;
	}

	public void setUyear(String uyear) {
		this.uyear = uyear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}
	
}
