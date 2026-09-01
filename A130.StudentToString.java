class StudentToString {
    String name;

    int age;  

    String rollnumber;

    String house;

    public StudentToString(String name, int age, String rollnumber, String house) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details: {Name: " + name + ",Age: " + age + ",Roll Number: " + rollnumber + ",House: " + house + " }";

    }

    public static void main(String[] args) {
        StudentToString student = new StudentToString("Vaibhav", 30, "56", "Shivaji");
        System.out.println(student);
    }
}
