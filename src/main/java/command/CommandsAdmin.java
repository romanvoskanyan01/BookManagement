package command;

public interface CommandsAdmin {

    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printAdminCommands() {
        System.out.println("Please input " + LOGOUT + " for logout");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR + " for print books by author");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("Please input " + ADD_AUTHOR + " for Add author");
        System.out.println("Please input " + PRINT_ALL_AUTHOR + " for print all authors");


    }

    static void printLoginCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + LOGIN + " for login");
        System.out.println("Please input " + REGISTER + " for register");

    }
}
