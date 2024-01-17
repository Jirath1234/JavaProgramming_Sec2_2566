public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}	
		public Author() {
		}
		public String getName() {
			return this.name;
		}
		public String getEmail() {
			return this.email;
		}
		public String getGender() {
			if(gender == 'M' || gender == 'm' ) {
				return "Male";
		}
			else if(gender == 'F' || gender == 'f' ) {
				return "Female";
			}
			else {
				return "null";
			}
		}
		public String toString() {
			if (getGender()!=null) {
				return "Author name: "+name+"("+email+";"+getGender()+")";
			}
			else {
				return name+"("+email+")";
			}
		}
}
