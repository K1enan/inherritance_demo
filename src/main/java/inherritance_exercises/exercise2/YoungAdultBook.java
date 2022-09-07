package inherritance_exercises.exercise2;

public class YoungAdultBook extends Book implements Loanable {

    public YoungAdultBook() {
        super();
    }

    public YoungAdultBook(String title, String author, int year) {
        super(title, author, year);
        super.setCategory(Category.ADULT);
    }

    public YoungAdultBook(String title, String author, Category category, int year, int pages) {
        super(title, author, category, year, pages);
    }

    public void loan() {
        System.out.println("You can loan a book from Young adult book");
    }


}

