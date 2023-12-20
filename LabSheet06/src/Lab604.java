import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentId,strSubjectID;
	static int subjectId;
	
	public static void main(String[] args) {
		inputStudent();
	}//end of main
	
	public static void inputStudent() {
		do {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
			//convert subjectId from integer to string (strSubjectID)
			strSubjectID = subjectId+"";
		} while(!(isLength(studentId, strSubjectID)));
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(strSubjectID));

	}//end of inputStudent
	
	public static boolean isLength(String id, String sub_id) {
		if(id.length()==10 && sub_id.length()==7) {
			return true;
		} else {
			return false;
		}
	}//end of isLength
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) {
			return true;
		} else {
			return false;
		}
	}//end of isITStudent
	
	public static boolean isITSubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21")&& sub_id.substring(4,5).equals("1")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void displayData(boolean sid,boolean subid) {
		if(sid) {
			System.out.println("Student id: "+studentId+"1st year student in IT");
		} else {
			System.out.println("Student id: "+studentId+"is not 1st year student in IT");
		}
		if (subid) {
			System.out.println("Enroll in courses for Year 1");
		} else {
			System.out.println("Not enroll in courses for Year 1");
		}
	} //end of displayData
}