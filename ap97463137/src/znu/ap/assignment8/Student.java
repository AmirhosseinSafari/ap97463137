package assignment8;


public abstract class Student implements Comparable<Student> {

    protected String fname;
    protected String lname;
    protected int id;

    @Override
    public String toString() {
        return this.type() + "\t" + this.getFname() + "\t" + this.getLname() + "\t" + this.getId() + "\t" + this.getStudySituation();
    }

    public abstract String type();
    public abstract String getFname();
    public abstract String getLname();
    public abstract int getId();
    public abstract int getStudySituation();


    @Override
    public int compareTo(Student student) {
        if (student.getId() > this.getId())
            return -1;
        if (student.getId() < this.getId())
            return 1;
        return 0;
    }
}
