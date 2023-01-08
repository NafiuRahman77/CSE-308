import java.util.ArrayList;
import java.util.List;

public class ExamController {
    private Examiner e;
    private Student1 s;

    public Examiner getE() {
        return e;
    }

    public ExamController() {

    }

    public void setE(Examiner e) {
        this.e = e;
    }

    public Student1 getS() {
        return s;
    }

    public void setS(Student1 s) {
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
    public void publishResult(){
        List<Integer>resId=new ArrayList<Integer>();
        resId=e.getId();
        List<Integer>resMarks=new ArrayList<Integer>();
         resMarks=e.getMarks();
        for(int i=0;i<resId.size();i++){
            System.out.print(" "+ resId.get(i));
        }
        System.out.println();
        for(int i=0;i<resId.size();i++){
            System.out.print(" "+ resMarks.get(i));
        }
        System.out.println();
    }
}
