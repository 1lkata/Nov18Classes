public class WorkersMail {
    public static void main(String[] args) {
        Worker w1 = new Worker("Tervel", "Enchev", "132D134",2300.24,4.56);
        Worker w2 = new Worker("Anton", "Jelyazkov","3324g324", 1200,3.78);

        System.out.println(w1.sendPerformanceMail());
        System.out.println();
        System.out.println(w2.sendPerformanceMail());

    }
}
class Worker{
    String firstName;
    String lastName;
    String employeeID;
    double salary;
    double performanceRating;
    public Worker(String firstName, String lastName, String employeeID, double salary, double performanceRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }
    public boolean isHighPerformer(){
        return performanceRating > 4.5;
    }
    public double calculatedBonus(){
        if(isHighPerformer()){
            double bonus = salary*0.2;
            salary += bonus;
            return bonus;
        } else return 0;
    }
    public String sendPerformanceMail(){
        if(isHighPerformer()){
            return "Dear " + firstName + " " + lastName + ",\n" +
                    "Based on your performance rating of " + performanceRating + ", you are a valued member of our team.\n" +
                    "Your bonus for this period is " + calculatedBonus() + "$. Keep up the great work!";
        }
        return "NO BONUS FOR YOU XD";
    }
}
