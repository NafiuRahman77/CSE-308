public class Examiner {
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

        int id=s.getRoll()-1;
        int prev=marks[id];
        marks[id]=s.getMark();
        StringBuilder str=new StringBuilder();

        str.append("Student id: " + Integer.toString(s.getRoll())+"\n"+"Previous marks : "+ Integer.toString(prev)+"\n"+"Corrected marks : "+Integer.toString(marks[id])+"\n");

        ec.Send(this, String.valueOf(str),marks[id]);
    }



}
