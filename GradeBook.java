

public class GradeBook {
    private String courseName;
    private String instructorName;

    public GradeBook(String cname , String iname) {
        courseName = cname;
        instructorName = iname;
    }

   public void setCourseName(String cname){
        cname=courseName;
   }

    public String getCourseName(){
        return courseName;
    }

    public void setInstructorName(String iname) {
        iname = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }


    public void displayMessage() {

        System.out.printf("Welcome to Grade Book \n%s!\n", getCourseName());
        System.out.printf("This Course is presented by : %s\n", getInstructorName());

    }

}






