class Book {
    static int totalnoofbooks;
    String Author;
    String Title;
    String Isbn;
    boolean isBorrowed;
    static{
        totalnoofbooks = 0;
    }
    {
        totalnoofbooks++;
    }
    Book(String Author,String Title,String isbn){
        this.Isbn = Isbn;
        this.Author = Author;
        this.Title = Title;
    } 
    Book(String Isbn){
        this(Isbn,"Unknown","Unknown");
    }
    static int getTotalnoofbooks(){
        return totalnoofbooks;
    }
    void borrowBook(){
        if(isBorrowed) {
            System.out.println("Book Already Borrowed");
        }else{
        this.isBorrowed = true;
            System.out.println("Enjoy The Book");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope You Enjoy,Please Leave A Review");
        }else{
            System.out.println("This Book Already In Library");
        }
    }

    public static void main(String[] args) {
        Book designofthings = new Book("author","Design","1");
                Book mybook = new Book("2");
        designofthings.borrowBook();
        mybook.borrowBook();
        designofthings.borrowBook();
        designofthings.returnBook();
        mybook.returnBook();
        mybook.returnBook();
    }
}
