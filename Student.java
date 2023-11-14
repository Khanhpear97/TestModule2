public class Student {
    private int studentCode;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averageGrade;

    public Student() {}
    public Student(int studentCode, String name, int age, String gender,
                   String address, double averageGrade) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averageGrade = averageGrade;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void input() {
        System.out.println("Mã sinh viên (số nguyên dương):");
        this.studentCode = Input.inputID();
        System.out.println("Tên:");
        this.name = Input.inputName();
        System.out.println("Tuổi:");
        this.age = Input.inputAge();
        System.out.println("Giới tính (Nam|Nữ):");
        this.gender = Input.inputGender();
        System.out.println("Địa chỉ:");
        this.address = Input.inputAddress();
        System.out.println("Điểm trung bình:");
        this.averageGrade = Input.inputGrade();
    }

    @Override
    public String toString() {
        return getStudentCode() + "," +
                getName() + "," +
                getAge() + "," +
                getGender() + "," +
                getAddress() + "," +
                getAverageGrade();
    }
}
