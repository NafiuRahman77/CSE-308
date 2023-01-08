import java.util.ArrayList;
import java.util.List;

public class ExamController {
    private Examiner e;
    private Student1 s;
    private List<Integer>resId=new ArrayList<Integer>();
    private List<Integer>resMarks=new ArrayList<Integer>();

    public Examiner getE() {
        return e;
    }

    public ExamController() {

    }

    public void setExaminer(Examiner e) {
        this.e = e;
    }

    public Student1 getS() {
        return s;
    }

    public void setStudent(Student1 s) {
        this.s = s;
    }
    public void Send(Student1 st, String msg){
        System.out.println(msg);
        System.out.println("Re examine request got from student id " + st.getRoll());
        this.s=st;
        e.Notify(st.getRoll(),msg, st.getMark());
    }
    public void Send(Examiner ex, String msg,int m){

        s.Notify(msg,m);
    }
    public void SendScript(ExamScript es){
        resId=es.getStudentId();
        resMarks=es.getMarks();

    }
    public void publishResult(){
        System.out.println("Id : ");
        for(int i=0;i<resId.size();i++){
            System.out.print(" "+ resId.get(i));
        }
        System.out.println("Marks: ");
        System.out.println();
        for(int i=0;i<resId.size();i++){
            System.out.print(" "+ resMarks.get(i));
        }
        System.out.println();
    }
}
