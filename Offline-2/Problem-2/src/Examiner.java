import java.util.ArrayList;
import java.util.Random;


public class Examiner{
    private int[] id;
    private int[] marks;
    private ExamController ec;

    public Examiner(ExamController ec,int[] ID, int[] m) {
        this.ec = ec;
        id=ID;
        marks=m;
        for(int i=0;i<5;i++){
            int r= (int)(Math.random()*(1-0+1)+0);
            if(r==0){
                marks[i]+=1;
            }

        }
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


    public ExamController getEc() {
        return ec;
    }

    public void setEc(ExamController ec) {
        this.ec = ec;
    }
    public void Notify(Student1 s, String msg){
        //System.out.println(msg);
        int id=s.roll-1;
        int prev=marks[id];
        marks[id]=s.marks;

        System.out.println("Student id: " + s.roll);
        System.out.println("Previous marks : "+ prev);
        System.out.println("Corrected marks : "+marks[id]);
    }
}
