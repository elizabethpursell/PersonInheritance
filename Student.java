public class Student extends LehighPerson{
    private String major;
    private String anticipatedGradDate;
    private static int totalCSEnrollment = 0;
    private static int totalEnrollment = 0;
    public Student(){
        super();
        totalEnrollment++;
    }
    public Student(String name, String address, String birthdate, String lin, String email){
        super(lin, email, name, address, birthdate);
        totalEnrollment++;
    }
    public Student(String lin, String email){
        super(lin, email);
        totalEnrollment++;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
        if(major.equals("CS")){
            totalCSEnrollment++;
        }
    }
    public String getAnticipatedGradDate(){
        return anticipatedGradDate;
    }
    public void setAnticipatedGradDate(String anticipatedGradDate){
        this.anticipatedGradDate = anticipatedGradDate;
    }
    public int getTotalCSEnrollment(){
        return totalCSEnrollment;
    }
    public int getTotalEnrollment(){
        return totalEnrollment;
    }
    public String toString(){
        return super.toString() + "Major: " + major + "\nAnticipated Grad Date: " + anticipatedGradDate + "\n";
    }
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student s = (Student) obj;
            return getLin().equals(s.getLin());
        }
        else{
            return false;
        }
    }
}
