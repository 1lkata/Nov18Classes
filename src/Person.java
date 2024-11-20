public class Person{
    public String name;
    public int age;
    public double height;
    public double weight;
    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public Person(){
        this.name = "Jonathan Porquoise";
        this.age = 18;
        this.height = 1.80;
        this.weight = 80;
    }
    public double toInch = this.height * 39.3700787;

    public String toFeet = toInch/12 +"' " + toInch%12+ "\"";
    public void introduce(){
        System.out.printf("""
            Hello, I am %s.
            I am %d years old, weigh %.2f kg, and my height is %.2f meters.
            In inches, that's %.2f, or %s in feet.
            """, name, age, weight, height, toInch, toFeet);
    }
}
