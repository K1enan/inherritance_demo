package inherritance_exercises;

import inherritance_exercises.exercise1.Car;
import inherritance_exercises.exercise1.Motorcycle;
import inherritance_exercises.exercise1.Truck;
import inherritance_exercises.exercise2.*;

public class InheritanceExercises {
    static ChildBook childBook = new ChildBook("Children books", "Author1", 2019);
    static YoungAdultBook youngAdultBook = new YoungAdultBook("Young books", "Author2", 2020);
    static ReferenceBook referenceBook = new ReferenceBook("Reference books", "Author3", 2018);
    static Book[] books = new Book[]{childBook, youngAdultBook, referenceBook};

    public static void main(String[] args) {

        System.out.println("Exercise No 1:\n");
        vehicleDrive();

        System.out.println("\nExercise No 3:\n");
        printInstanceOfLoanable();
        printNotLoanable();
        printChildBookCategory();
        printAdultBookCategory();

    }

    public static void vehicleDrive() {

        Car car = new Car(12345, "ABC123", "BMW", 4, 4);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson");
        Truck truck = new Truck(200, 90000);
        System.out.println(car.drive());
        System.out.println(motorcycle.drive());
        System.out.println(truck.drive());

    }

    public static void printInstanceOfLoanable() {

        System.out.println("3b.Instance of Loanable Books:");
        for (Book loanableBook : books) {
            if (loanableBook instanceof Loanable)
                System.out.println(loanableBook.printOutInfo());
        }

    }

    public static void printNotLoanable() {

        System.out.println("\n3c.Books that is not LOANABLE: ");
        for (Book notLoanableBook : books) {
            if (notLoanableBook.getCategory() == Category.NOT_LOANABLE)
                System.out.println(notLoanableBook.printOutInfo());
        }
    }

    public static void printChildBookCategory() {

        System.out.println("\n3d.Books with CHILD category:");
        for (Book notLoanableBook : books) {
            if (notLoanableBook.getCategory() == Category.CHILD)
                System.out.println(notLoanableBook.printOutInfo());
        }
    }

    public static void printAdultBookCategory() {

        System.out.println("\n3e.Books with ADULT category:");
        for (Book notLoanableBook : books) {
            if (notLoanableBook.getCategory() == Category.ADULT)
                System.out.println(notLoanableBook.printOutInfo());
        }
    }

}
