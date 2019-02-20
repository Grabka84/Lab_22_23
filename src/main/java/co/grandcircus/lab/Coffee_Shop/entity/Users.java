package co.grandcircus.lab.Coffee_Shop.entity;

public class Users {

	// fields
	private long id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String userEmail;
	private String userYear;
	private String gender;

	// Constructors
	public Users() {}

	public Users(long id, String firstName, String lastName, String phoneNum, String userEmail, String userYear, String gender) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setUserEmail(userEmail);
		setUserYear(userYear);
		setGender(gender);
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getUserEmail() {
		return userEmail;
	}

	public String getUserYear() {
		return userYear;
	}

	public String getGender() {
		return gender;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserYear(String userYear) {
		this.userYear = userYear;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
