import java.io.*;
import java.util.ArrayList;

public class readAndWriteFile {
    private File file = new File("Data/StudentList.csv");

    public void writeFile(ArrayList<Student> students){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            String line = "";
            for (Student student: students) {
                line += student.toString();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(){
        ArrayList<Student> students = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Student student = new Student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),data[3],data[4],Double.parseDouble(data[5]));
                students.add(student);
            }
            bufferedReader.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return students;
    }
}
