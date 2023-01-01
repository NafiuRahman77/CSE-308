import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ExamController ec=new ExamController();
        Student1 s1=new Student1(ec,10,1);
        Student1 s2=new Student1(ec,20,2);
        Student1 s3=new Student1(ec,30,3);
        Student1 s4=new Student1(ec,40,4);
        Student1 s5=new Student1(ec,50,5);
        int[] stdMarks={s1.getMarks(),s2.getMarks(),s3.getMarks(),s4.getMarks(),s5.getMarks()};
        int[]stdId={s1.getRoll(),s2.getRoll(),s3.getRoll(),s4.getRoll(),s5.getRoll()};

        Examiner e=new Examiner(ec,stdId,stdMarks);
        ec.setE(e);
        ec.publishResult();
        Scanner sc=new Scanner(System.in);

//        s3.Send("Re examine request sent from "+ s3.getRoll());
//
//        s1.Send("Re examine request sent from "+ s1.getRoll());
        while(true){
            System.out.println("Please enter your id to re-examine");
            int inp=sc.nextInt();
            if(inp==1){
                s1.Send("Re examine request sent from "+ s1.getRoll());
            }
            if(inp==2){
                s2.Send("Re examine request sent from "+ s1.getRoll());
            }
            if(inp==3){
                s3.Send("Re examine request sent from "+ s1.getRoll());
            }
            if(inp==4){
                s4.Send("Re examine request sent from "+ s1.getRoll());
            }
            if(inp==5){
                s5.Send("Re examine request sent from "+ s1.getRoll());
            }
            if(inp==7){
                break;
            }

        }
        ec.publishResult();


    }
}
