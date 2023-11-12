package Developer_Student_Classes;

public class Education {
    private Degree degree;
    private Major major;
    enum Degree {BS, MS, PhD};
    enum Major {CS, CE, SE, DS};
    public Education(Degree degree, Major major){
        this.degree = degree;
        this.major = major;
    }
    public Education(){
        this(Degree.BS, Major.DS);
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
