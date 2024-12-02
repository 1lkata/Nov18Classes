public class Students {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Aleks","Tomov",11,2.7,"National High School in Finance and Business");
        Student s3 = new Student("Teodor","Ivanov",11,3.9);
        System.out.println(s1.honorStudentEmail());
        System.out.println(s2.honorStudentEmail());
        System.out.println(s3.honorStudentEmail());
    }
}
class Student{
    String name;
    String lastName;
    int gradeLevel;
    double gpa;
    String schoolName;
    public Student(){
        name = "Samuil";
        lastName = "Petrov";
        gradeLevel=11;
        gpa=4.0;
        schoolName="American College of Sofia";
    }
    public Student(String name, String lastName, int gradeLevel, double gpa, String schoolName){
        this.name = name;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.schoolName = schoolName;
    }
    public Student(String name, String lastName, int gradeLevel, double gpa){
        this.name = name;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.schoolName = "American College of Sofia";
    }
    public boolean isHonorStudent(){
        return gpa>3.8;
    }
    public String honorStudentEmail(){
        if(isHonorStudent()){
            return ("Dear "+name+ ", you are selected as one of the honor students of "+schoolName+" in class 2023 with the GPA of "+gpa+". Congratulations and we look forward to celebrating your achievement in the graduation ceremony.");
        } else return "Sorry, "+name+", You did not make it on the Honor Roll :(";
    }
}
