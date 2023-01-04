import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ExamController ec=new ExamController();
        Student1 s1=new Student1(ec,10,1);
        Student1 s2=new Student1(ec,20,2);
        Student1 s3=new Student1(ec,30,3);
        Student1 s4=new Student1(ec,40,4);
        Student1 s5=new Student1(ec,50,5);
        List<Integer> stdMarks=new ArrayList<Integer>();

        stdMarks.add(s1.getMark()); stdMarks.add(s2.getMark());stdMarks.add(s3.getMark());stdMarks.add(s4.getMark());stdMarks.add(s5.getMark());

        List<Integer>stdId=new ArrayList<Integer>();
        stdId.add(s1.getRoll()); stdId.add(s2.getRoll());stdId.add(s3.getRoll());stdId.add(s4.getRoll());stdId.add(s5.getRoll());


        Examiner e=new Examiner(ec,stdId,stdMarks);
        ec.setE(e);
        ec.publishResult();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Please enter your id to re-examine");
            int inp=sc.nextInt();
            if(inp==1){
                s1.reExamine("Re examine request sent from student id "+ s1.getRoll());
            }
            if(inp==2){
                 s2.reExamine("Re examine request sent from student id "+ s2.getRoll());
            }
            if(inp==3){
                 s3.reExamine("Re examine request sent from student id "+ s3.getRoll());
            }
            if(inp==4){
                 s4.reExamine("Re examine request sent from student id "+ s4.getRoll());
            }
            if(inp==5){
                 s5.reExamine("Re examine request sent from student id "+ s5.getRoll());
            }
            if(inp==7){
                break;
            }

        }
        ec.publishResult();


    }
}
