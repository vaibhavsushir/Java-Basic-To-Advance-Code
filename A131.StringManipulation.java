class StringManipulation {
    public static void main(String[] args) {
        String  firstname = "prashant";
        String lastname = "Jain";
       // String fullname = firstname + " " + lastname;
        String fullname = firstname.concat( " " ).concat( lastname);
        System.out.println(fullname.toUpperCase());

    }
}
