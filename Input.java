import regex.Example;
import Exception.InputException;

import java.util.Scanner;

public class Input {
    public static String inputName() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String name = input.nextLine().trim();
            try {
                boolean isValid = Example.checkStudentName(name);
                if (isValid) {
                    return name;
                } else {
                    throw new IllegalAccessException("Sai cú pháp, vui lòng nhập lại!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputAddress() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String address = input.nextLine().trim();
            try {
                boolean isValid = Example.checkStudentAddress(address);
                if (isValid) {
                    return address;
                } else {
                    throw new IllegalAccessException("Sai cú pháp, vui lòng nhập lại!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String inputGender() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String gender = input.nextLine().trim();
            try {
                boolean isValid = Example.checkStudentGender(gender);
                if (isValid) {
                    return gender;
                } else {
                    throw new IllegalAccessException("Sai cú pháp, vui lòng nhập lại!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static int inputID() {
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        boolean isValidInput = false;

        do {
            try {
                id = Integer.parseInt(scanner.nextLine());

                if (id < 0) {
                    throw new InputException("Mã sinh viên phải lớn hơn 0");
                }

                isValidInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Sai cú pháp, vui lòng nhập lại!");
            } catch (InputException e) {
                System.err.println(e.getMessage());
            }
        } while (!isValidInput);

        return id;
    }

    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean isValidInput = false;

        do {
            try {
                age = Integer.parseInt(scanner.nextLine());

                if (age < 18) {
                    throw new InputException("Tuổi sinh viên phải lớn hơn 18");
                }

                isValidInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Sai cú pháp, vui lòng nhập lại!");
            } catch (InputException e) {
                System.err.println(e.getMessage());
            }
        } while (!isValidInput);

        return age;
    }

    public static double inputGrade() {
        Scanner scanner = new Scanner(System.in);
        double averageGrade = 0;
        boolean isValidInput = false;

        do {
            try {
                averageGrade = Double.parseDouble(scanner.nextLine());

                if (averageGrade < 0 || averageGrade > 10) {
                    throw new InputException("Điểm trung bình phải từ 0 đến 10");
                }
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Sai cú pháp, vui lòng nhập lại!");
            } catch (InputException e) {
                System.err.println(e.getMessage());
            }
        } while (!isValidInput);

        return averageGrade;
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Sai cú pháp, vui lòng nhập lại!");
            }
        }
    }
}
