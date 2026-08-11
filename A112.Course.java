class Course {
    static int maxcapacity = 100;

    String coursename;
    int enrollments;
    String[] enrolledstudents = new String[maxcapacity];
    Course(String coursename){
            this.coursename = coursename;
            this.enrollments = 0;
            this.enrolledstudents = new String[maxcapacity];
    }
    static void setMaxcapacity(int maxcapacity){
        Course.maxcapacity =maxcapacity;
    }
    void enrollstudents(String studentname){
        enrolledstudents[enrollments] = studentname;
        enrollments++;
    }
    void unrolledstudent(String studentname){
        System.out.println("StudentName Removed");
        enrollments++;;
    }
}
