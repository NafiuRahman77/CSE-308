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
        e.Notify(st,msg);
    }
    public void Send(Examiner ex, String msg,int m){

        s.Notify(msg,m);
    }
    public void publishResult(){
        int[] resId=e.getId();
        int[] resMarks=e.getMarks();
        for(int i=0;i<5;i++){
            System.out.print(" "+ resId[i]);
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(" "+ resMarks[i]);
        }
        System.out.println();
    }
}
