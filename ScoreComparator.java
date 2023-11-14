import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        Double a1 = s1.getAverageGrade();
        Double a2 = s2.getAverageGrade();
        return a1.compareTo(a2);
    }
}
