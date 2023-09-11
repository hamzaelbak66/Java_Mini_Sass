import DataBase.DB;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void PrincipalMenu() throws SQLException, ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************ WELCOME TO OUR LIBRARY *******************");
        System.out.println("1 : ______________ Search For a book _________________ ");
        System.out.println("2 : _______________ Show All Books ___________________  ");
        System.out.println("3 : _______________ Create a Book ____________________  ");
        System.out.println("4 : ___________ Update Or Delete a Book ______________  ");
        System.out.println("5 : _____________ change Book Statut _________________  ");
        System.out.println("6 : _________________ Find Books _____________________  ");
        System.out.println("7 : _______________ Borrow a Book ____________________ ");
        System.out.println("8 : ______________ get all members ___________________ ");
        System.out.println("9 : ______ Check date for all borrows books __________ ");
        System.out.println("10 : _______________ Statistiques _____________________ ");

        menu menu = new menu();
        System.out.println("Enter a number to implement the Method : \n");
        String checker = scanner.nextLine();
        if (checker == "") {
            PrincipalMenu();
        }
        int check = Integer.parseInt(checker);
        switch (check) {
            case 1:
                menu.getOneBook();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 2:
                menu.getAllBooks();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }

            case 3:
                menu.insetBook();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 4:
                menu.UpdateOrDeleteBook();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 5:
                menu.changeBookStatut();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 6:
                menu.getBooksByStatus();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 7:
                menu.Borrow_a_Book();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 8:
                menu.getALL();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 9:
                menu.checkDates();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            case 10:
                menu.Statistiques();
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
            default:
                System.out.println("Choice Not Found");
                System.out.println("Back to menu click 1 , else to exit :");
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    PrincipalMenu();
                } else {
                    break;
                }
        }

    }

    public static void main(String[] args) {
        try {
            PrincipalMenu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}