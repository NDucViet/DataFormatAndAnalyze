package XYZ.FomatData.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataController {
    public final Scanner in = new Scanner(System.in);
    public final String PHONE_VALID = "^[0-9]{10}$";
    public final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

    public String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public String checkInputPhone() {
        while (true) {
            try {
                System.out.println("Input your phone number");

                String resultCheck = in.nextLine();
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            try {
                System.out.println("Input Date");
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                if(!checkDate(dateCheck)){
                    System.out.println("Date wrong");
                    continue;
                }
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            System.out.println("Input email");
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }

    public boolean checkDate(String dateCheck) {
        String a[] = dateCheck.split("/");

        if (Integer.parseInt(a[1]) == 2) {
            if (Integer.parseInt(a[a.length - 1]) % 4 == 0) {
                if (!(Integer.parseInt(a[a.length - 1]) % 100 == 0)) {
                    if (Integer.parseInt(a[0]) != 29) {
                        return false;
                    }
                }
                if (Integer.parseInt(a[a.length - 1]) % 100 == 0) {
                    if (Integer.parseInt(a[a.length - 1]) % 400 == 0) {
                        if (Integer.parseInt(a[0]) != 29) {
                            return false;
                        }
                    } else {
                        if (Integer.parseInt(a[0]) != 28) {
                            return false;
                        }
                    }
                }
            } else {
                if (Integer.parseInt(a[0]) != 28) {
                    return false;
                }
            }
        }
        if (Integer.parseInt(a[1]) == 1 || Integer.parseInt(a[1]) == 3 || Integer.parseInt(a[1]) == 5
                || Integer.parseInt(a[1]) == 7 || Integer.parseInt(a[1]) == 8 || Integer.parseInt(a[1]) == 10
                || Integer.parseInt(a[1]) == 12) {
            if (Integer.parseInt(a[0]) != 31) {
                return false;
            }
        }
        if (Integer.parseInt(a[1]) == 4 || Integer.parseInt(a[1]) == 6 || Integer.parseInt(a[1]) == 9
                || Integer.parseInt(a[1]) == 11) {
            if (Integer.parseInt(a[0]) != 30) {
                return false;
            }
        }

        return true;
    }
}
