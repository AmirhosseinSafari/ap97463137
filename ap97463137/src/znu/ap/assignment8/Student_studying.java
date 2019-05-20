package assignment8;


public class Student_studying extends Student {

    int studied_courses;

    public Student_studying(String fname , String lname, int id, int StudySituation ) throws WrongNumberofCourses {

        this.setFname(fname);
        this.setlname(lname);
        this.setId(id);
        this.setStudied_courses(StudySituation);
    }

    public Student_studying() {

    }

    public void setFname(String fname){
        this.fname = fname;
    }
    public void setlname(String lname){
        this.lname = lname;
    }
    public void setId(int id){ this.id = id; }

    @Override
    public String type() { return "Studentstudying"; }

    @Override
    public String getFname() { return super.fname; }

    @Override
    public String getLname() { return super.lname; }

    @Override
    public int getId() { return super.id; }

    @Override
    public int getStudySituation() { return this.studied_courses; }

    public void setStudied_courses(int studied_courses) throws WrongNumberofCourses {
        if(studied_courses<250){
            this.studied_courses = studied_courses;
        }else{
            throw new WrongNumberofCourses();
        }
    }

    class WrongNumberofCourses extends Throwable {
        public WrongNumberofCourses(){
            super("Wrong Input!");
        }
    }
}
