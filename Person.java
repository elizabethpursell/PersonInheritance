public class Person {  //superclass
        
    private String name; 
    private String address;
    private String birthdate; //in the form: YYYYMMDD

    public Person(String name, String address, String birthdate) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
    }
    
    public Person() {
        name = "";
        address = "";
        birthdate = "";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nBirthdate: " + birthdate + "\n";
    }
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;        //downcasting
            return name.equals(p.getName());
        }
        else{
            return false;
        }
    }
}
