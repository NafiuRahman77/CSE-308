public class ExamScript {
    private int studentId;
    private int marks;

    public ExamScript(int studentId, int marks) {
        this.studentId = studentId;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }
}
