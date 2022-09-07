package inherritance_exercises.exercise2;

public class Book {

    //title,author,category(enum),year and pages.
    private String title;
    private String author;
    private Category category;
    private int year;
    private int pages;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = 100;
    }

    public Book(String title, String author, Category category, int year, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPages() {
        this.pages = 100;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
    public String printOutInfo(){

        return "Title: " + getTitle() + " ,Author: " + getAuthor() + " ,No of pages: " +getPages()+ " ,Year: "+ getYear() + " ,Category: " +getCategory();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}

