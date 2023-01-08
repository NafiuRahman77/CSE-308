import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Examiner {
    private List<Integer> id;
    private List<Integer> marks;
    private ExamController ec;

    public Examiner(ExamController ec,List<Integer> ID, List<Integer> m) {
        this.ec = ec;
        id=ID;
        marks=m;
        for(int i=0;i<ID.size();i++){
            int r= (int)(Math.random()*(1-0+1)+0);
            if(r==0){
                int res=marks.get(i)-1;
                marks.set(i,res);
            }

        }
    }
    public void sendScript(List<Integer> list){
        List<Integer> marksheets = new ArrayList<>();

        for(int i=0; i<list.size(); i++) {
            int r= (int)(Math.random()*(1-0+1)+0);
            if(r==0){
                marksheets.add(list.get(i)-1);
            }
        }

    }

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public ExamController getEc() {
        return ec;
    }

    public void setEc(ExamController ec) {
        this.ec = ec;
    }
    public void Notify(int roll, String msg, int expectedMark){

        int id=roll-1;
        int prev=marks.get(id);
        marks.set(id,expectedMark);
        StringBuilder str=new StringBuilder();

        str.append("Student id: " + Integer.toString(roll)+"\n"+"Previous marks : "+ Integer.toString(prev)+"\n"+"Corrected marks : "+Integer.toString(marks.get(id))+"\n");

        ec.Send(this, String.valueOf(str),marks.get(id));
    }



}
