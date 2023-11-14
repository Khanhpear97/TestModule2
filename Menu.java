import Exception.InputException;
public class Menu {
    public static void start() {
        StudentManager studentManager = new StudentManager();
        do {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----\n" +
                    "Chọn chức năng theo số (để tiếp tục)\n" +
                    "1. Xem danh sách sinh viên\n" +
                    "2. Thêm mới\n" +
                    "3. Cập nhật\n" +
                    "4. Xoá\n" +
                    "5. Sắp xếp\n" +
                    "6. Đọc từ file\n" +
                    "7. Ghi vào file\n" +
                    "8. Thoát\n" +
                    "Chọn chức năng:");
            int key = Input.inputNumber();
            switch (key) {
                case 1:
                    studentManager.showStudentManager();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    try {
                        studentManager.updateStudent();
                    } catch (InputException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        studentManager.removeStudent();
                    } catch (InputException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 5:
                    studentManager.sortStudent();
                    break;
                case 6:
                    studentManager.readFile();
                    break;
                case 7:
                    break;
                case 8:
                    return;
            }
        } while (true);
    }
}
