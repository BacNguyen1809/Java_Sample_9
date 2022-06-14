/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package fa.training.entities;

public abstract class Teacher {
		    private String designation;
		    private String collegeName;
		
		    public Teacher() {
		    }
		
		    public Teacher(String designation, String collegename) {
		        super();
		        this.designation = designation;
		        this.collegeName = collegename;
		    }
		
		    public String getDesignation() {
		        return designation;
		    }
		
		    public void setDesignation(String designation) {
		        this.designation = designation;
		    }
		
		    public String getCollegename() {
		        return collegeName;
		    }
		
		    public void setCollegename(String collegename) {
		        this.collegeName = collegename;
		    }
		
		    public abstract void teach();
		

}
