public class PersonInheritance {
    public static void main(String [] args){

        //array of a Student object type
        Student [] roster = new Student[5];
        roster[0] = new Student("Emily", "194 Elm Street", "19770503", "472957293", "ems525");
        roster[0].setAnticipatedGradDate("2025");
        roster[0].setMajor("CS");
        roster[1] = new Student("Sofia", "285 3rd Street", "19760101", "572957394", "soq523");
        roster[1].setAnticipatedGradDate("2023");
        roster[1].setMajor("History");
        roster[2] = new Student("Adam", "9123 Sayre Drive", "20010110", "572917463", "ahd522");
        roster[2].setAnticipatedGradDate("2022");
        roster[2].setMajor("Mechanical Engineering");
        roster[3] = new Student("Patrick", "297 Oak Avenue", "19991013", "674935584", "psj524");
        roster[3].setAnticipatedGradDate("2024");
        roster[3].setMajor("Chemistry");
        roster[4] = new Student("Sandy", "813 Hemlock Drive", "20021230", "073930275", "sjj522");
        roster[4].setAnticipatedGradDate("2022");
        roster[4].setMajor("CS");

        //print roster array with totals
        System.out.println("Roster: ");
        for(int index = 0; index < roster.length; index++){
            System.out.println(roster[index].toString());
        }
        System.out.println("Total CS Enrollment: " + roster[0].getTotalCSEnrollment());
        System.out.println("Total Enrollment: " + roster[0].getTotalEnrollment());
        System.out.println();

        //sorts roster based on ascending name
        SelectionSort(roster);
        for(int index = 0; index < roster.length; index++){
            System.out.println(roster[index].toString());
        }
    }
    public static void SelectionSort(Person [] p){
        for(int i = 0; i < p.length - 1; i++){
            int indexMin = i;
            Person min = p[i];
            for(int j = i+ 1; j < p.length; j++){
                if(min.getName().compareTo(p[j].getName()) > 0){
                    min = p[j];
                    indexMin = j;
                }
            }
            if(indexMin != i){
                p[indexMin] = p[i];
                p[i] = min;
            }
        }
    }

}