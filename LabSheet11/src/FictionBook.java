import java.time.*;
public class FictionBook {

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public String getLastName() {
		return this.author_name.toUpperCase().substring(author_name.indexOf(" ")+1);
	}
	
	public String getFirstName() {
		return this.author_name.toUpperCase().substring(0,author_name.indexOf(" "));
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		return this.author_name.indexOf(" ") >= 0;
	}
	
	public Boolean checkEmail() {
		if(email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int totalpublicYear() {
		return Year.now().getValue() - this.publicYear;
	}
	
	public String toString() {
		return getTitle()+" write by "+getLastName().substring(0,1)+"."+getFirstName()+"("+this.email+")\nPubliched for "+totalpublicYear()+" years.";
	}
}
