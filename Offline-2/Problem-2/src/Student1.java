public class Student1 {
    int marks;
    int roll;
    ExamController ec;

    public Student1(ExamController ec, int marks, int roll) {
        this.marks = marks;
        this.roll = roll;
        this.ec=ec;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void print(){
        System.out.println("Marks is : "+ marks);
    }
    public void Send(String msg){
        System.out.println(msg);
        ec.Send(this,msg);
    }
}
