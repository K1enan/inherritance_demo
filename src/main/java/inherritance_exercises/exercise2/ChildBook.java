package inherritance_exercises.exercise2;

public class ChildBook extends Book implements Loanable {


    public ChildBook() {
        super();
    }

    public ChildBook(String title, String author, int year) {
        super(title, author, year);
        super.setCategory(Category.CHILD);
    }

    public ChildBook(String title, String author, Category category, int year, int pages) {
        super(title, author, category, year, pages);
    }

    @Override
    public void loan() {
        System.out.println("You can loan a book from Child book ");
    }


}
