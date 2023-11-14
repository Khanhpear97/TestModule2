import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Exception.InputException;

public class StudentManager {
    ArrayList<Student> studentManager = new ArrayList<>();

    public StudentManager() {
//        studentManager = (ArrayList<Student>) readAndWriteFile.readFile();
    }

    private readAndWriteFile readAndWriteFile = new readAndWriteFile();

    public void showStudentManager() {
        for (Student student : studentManager) {
            System.out.println(student.toString());
        }
    }

    public void readFile() {
        readAndWriteFile.readFile();
    }

    public void addStudent() {
        Student student = new Student();
        student.input();
        studentManager.add(student);
        readAndWriteFile.writeFile(studentManager);
    }

    public void updateStudent() throws InputException {
        System.out.println("Nhập ID để tìm kiếm sinh viên:");
        int id = Input.inputNumber();
        boolean check = false;
        for (Student student : studentManager) {
            if (id == student.getStudentCode()) {
                do {
                    System.out.println("---- CẬP NHẬT THÔNG TIN SINH VIÊN ----\n" +
                            "Chọn chức năng theo số (để tiếp tục)\n" +
                            "1. Cập nhật tên\n" +
                            "2. Cập nhật tuổi\n" +
                            "3. Cập nhật giới tính\n" +
                            "4. Cập nhật địa chỉ\n" +
                            "5. Cập nhật điểm trung bình\n" +
                            "6. Trở lại menu\n" +
                            "Chọn chức năng:");
                    int key = Input.inputNumber();
                    switch (key) {
                        case 1:
                            student.setName(Input.inputName());
                            break;
                        case 2:
                            student.setAge(Input.inputAge());
                            break;
                        case 3:
                            student.setGender(Input.inputGender());
                            break;
                        case 4:
                            student.setAddress(Input.inputAddress());
                            break;
                        case 5:
                            student.setAverageGrade(Input.inputGrade());
                            break;
                        case 6:
                            return;
                    }
                } while (true);
            }
        }
        if (!check) {
            throw new InputException("Không tìm thấy ID sinh viên.");
        }
    }

    public void removeStudent() throws InputException {
        System.out.println("Nhập ID để tìm sinh viên cần xoá:");
        int id = Input.inputNumber();
        boolean check = false;
        for (Student student: studentManager) {
            if (student.getStudentCode() == id) {
                check = true;
                studentManager.remove(student);
            }
        }
        if (!check) {
            throw new InputException("Không tìm thấy ID sinh viên.");
        }
    }

    public void sortStudent() {
        do {
            System.out.println("---- SẮP XẾP SINH VIÊN THEO ĐIỂM TRUNG BÌNH ----\n" +
                    "Chọn chức năng theo số (để tiếp tục)\n" +
                    "1. Sắp xếp điểm trung bình tăng dần\n" +
                    "2. Sắp xếp điểm trung bình giảm dần\n" +
                    "3. Trở lại menu\n" +
                    "Chọn chức năng:");
            int key = Input.inputNumber();
            switch (key) {
                case 1:
                    ScoreComparator scoreComparator = new ScoreComparator();
                    studentManager.sort(scoreComparator);
                    break;
                case 2:
                    ScoreComparator scoreComparator1 = new ScoreComparator();
                    studentManager.sort(scoreComparator1.reversed());
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
