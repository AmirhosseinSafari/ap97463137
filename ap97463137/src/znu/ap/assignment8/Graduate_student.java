package assignment8;


public class Graduate_student extends Student {


    protected int year_of_graduation;

    public Graduate_student(){

    }
    public Graduate_student(String fname , String lname, int id, int StudySituation ) throws WrongGraduteYear {

        this.setFname(fname);
        this.setlname(lname);
        this.setId(id);
        this.setYear_of_graduation(StudySituation);
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public void setlname(String lname){
        this.lname = lname;
    }

    public void setId(int id){
        this.id = id;
    }


    @Override
    public String type() { return "Graduatedstudent"; }

    @Override
    public String getFname() {
        return this.fname;
    }

    @Override
    public String getLname() { return this.lname; }

    @Override
    public int getId() { return this.id; }

    @Override
    public int getStudySituation() { return this.year_of_graduation; }


    public void setYear_of_graduation(int year_of_graduation) throws WrongGraduteYear {
        if(year_of_graduation>1380){
            this.year_of_graduation = year_of_graduation;
        }else{
            throw new WrongGraduteYear();
        }
    }


    class WrongGraduteYear extends Throwable{
        public WrongGraduteYear(){
            super("Wrong Input!");
        }
    }
}
