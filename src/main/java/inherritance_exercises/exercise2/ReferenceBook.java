package inherritance_exercises.exercise2;

public class ReferenceBook extends Book {

    public ReferenceBook() {
        super();
    }

    public ReferenceBook(String title, String author, int year) {
        super(title, author, year);
        super.setCategory(Category.NOT_LOANABLE);
    }

    public ReferenceBook(String title, String author, Category category, int year, int pages) {
        super(title, author, category, year, pages);
    }
}
