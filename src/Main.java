public class Main {
    public static void main(String[] args) {
    // Task 6: Create more objects and test the methods
    Person1 p1 = new Person1("Eda", "eda@gmail.com", 1234567890L,23);
    p1.print();
    Person1 p2 = new Person1("Hannah", "hannah@gmail.com", 4048999955L, 25);
    p2.print();
    System.out.println(p1.getAge());
    System.out.println(p2.getAge());
    System.out.println(p1.getEmail());
    System.out.println(p2.getEmail());
    System.out.println(p1.getPhoneNumber());
    System.out.println(p2.getPhoneNumber());
    System.out.println(p1.getName());
    System.out.println(p2.getName());
    p1.updateAge(24);
    p2.updateAge(26);
    p1.print();
    p2.print();
    System.out.println(p1.getEmail());
    p1.updateEmail("eda@gmail.com");
    System.out.println(p1.getEmail());

    


    // Task 8: Test the updateEmail method

}
}

// Define the Person class here
class Person1 {
    // Instance variables
    private final String name;
    private String email;
    private String phoneNumber;
    private int age;
    // Constructor: Initialize Person data
    public static String createPhoneNumberString(long phoneNumber) {
        String numStr = String.valueOf(phoneNumber);
        if (numStr.length() != 10) {
            throw new IllegalArgumentException("Number must be exactly 10 digits long.");
        }
        String firstPart = numStr.substring(0, 3);
        String secondPart = numStr.substring(3, 6);
        String thirdPart = numStr.substring(6, 10);
        return firstPart + "-" + secondPart + "-" + thirdPart;
    }

    public Person1(String initName, String initEmail, long initPhone, int age) { // Task 2: modify method signature to include your new attribute.
        name = initName;
        email = initEmail;
        phoneNumber = createPhoneNumberString(initPhone);
        this.age = age;

    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);
        // Task 4: Print the new attribute here
    }

    // Task 5: Add getter methods to access and return each attribute individually. Here's an example:
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }

    // Task 7: Add a method to update the email
    public void updateEmail(String newEmail) {
        email = newEmail;
    }
    public void updatePhoneNumber(long newPhoneNumber) {
        phoneNumber = createPhoneNumberString(newPhoneNumber);
    }
    public void updateAge(int newAge) {
        age = newAge;
    }
}