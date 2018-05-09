package tss.requests.information;

public class AddCourseinProgramRequest {
    private String studentname;
    private String coursename;
    private Integer coursetype;

    public String getStudentname() {
        return studentname;
    }
    public String getCoursename() {
        return coursename;
    }

    public Integer getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(Integer coursetype) {
        this.coursetype = coursetype;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

}
