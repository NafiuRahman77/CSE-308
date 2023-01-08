import java.util.ArrayList;
import java.util.List;

public class ExamScript {
    private List<Integer> studentId=new ArrayList<>();
    private List<Integer> marks=new ArrayList<>();

    public ExamScript(List<Integer> studentId, List<Integer> marks) {
        this.studentId = studentId;
        this.marks = marks;
    }

    public List<Integer> getStudentId() {
        return studentId;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
