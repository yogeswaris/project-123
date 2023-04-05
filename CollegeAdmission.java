package uni.hin.stud;

public class CollegeAdmission extends StudentInfo {

	@Override
	public void communityCertificate() {
System.out.println("Community Certificate Copy");		
	}
	public static void main(String[] args) {
		CollegeAdmission ca = new CollegeAdmission();
		ca.aadharcar();
		ca.votersId();
		ca.communityCertificate();
	}
	

}
