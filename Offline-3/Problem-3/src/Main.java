import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Company util(List<Company> companyList,String s){
        for(int i=0; i<companyList.size();i++){
            if(companyList.get(i).getName().equalsIgnoreCase(s)){
                return companyList.get(i);
            }
        }
        return null;
    }
    public static Employee util1(Company c,String s){
        List<Employee> projectList=c.getProjectList();
        for(int i=0; i<projectList.size();i++){
            if(projectList.get(i).getCurrentProject().equalsIgnoreCase(s)){
                return projectList.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
//        Employee e1=new Developer("Robert Oppenheimer",  "CSE308");
//        Employee e2=new Developer("John Von Newman",  "CSE308");
//        Employee e3=new Manager("Alan Turing", "CSE308");
//        Company company=new Company("Optimizely");
//        company.addEmployee(e3);
//        Employee e5=new Manager("David Patterson", "CSE307");
//        Employee e4=new Developer("Alfred Aho",  "CSE307");
//        company.addEmployee(e5);
//        e5.addEmployee(e4);
//        e3.addEmployee(e1);
//        e3.addEmployee(e2);
//        company.hierarchy();
//        company.details("Alfred Aho");
//        company.removeManager("Alfred Aho");
//        company.hierarchy();
//        company.removeManager("David Patterson");
//        company.hierarchy();

        Scanner sc=new Scanner(System.in);
        List<Company> companyList=new ArrayList<>();
        while(true){
            System.out.println("Press 1 to add a new company");
            System.out.println("Press 2 to add manager to an existing company");
            System.out.println("Press 3 to add developer to an existing company");
            System.out.println("Press 4 to a see company hierarchy");
            System.out.println("Press 5 to see employee details");
            System.out.println("Press 6 to remove a manager");
            System.out.println("Press 7 to remove a developer");
            System.out.println("Press 8 to exit");

            int a= sc.nextInt();
            String res=sc.nextLine();

            if(a==1){
                System.out.println("Enter company name :");
                String b=sc.nextLine();
                Company c=new Company(b);
                companyList.add(c);

            }
            if(a==2){
                System.out.println("Enter your company name : ");
                String b=sc.nextLine();
                Company comp=util(companyList,b);
                if(comp!=null){
                    System.out.println("Enter manager name :");
                    String c=sc.nextLine();
                    System.out.println("Enter manager project name :");
                    String d=sc.nextLine();
                    Employee e=new Manager(c, d);
                    comp.addEmployee(e);
                }
                else{
                    System.out.println("This company doesn't exist");
                }

            }
            if(a==3){
                System.out.println("Enter your company name");
                String b=sc.nextLine();
                Company comp=util(companyList,b);
                if(comp!=null){
                    System.out.println("Enter developer name");
                    String c=sc.nextLine();
                    System.out.println("Enter developer project name");
                    String d=sc.nextLine();
                    Employee temp=util1(comp,d);
                    if(temp!=null) {
                        Employee e = new Developer(c, d);
                        temp.addEmployee(e);
                    }
                    else{
                        System.out.println("The project doesn't exist");
                    }
                }
                else{
                    System.out.println("This company doesn't exist");
                }

            }
            if(a==4){
                System.out.println("Enter your company name");
                String b=sc.nextLine();
                Company comp=util(companyList,b);
                if(comp!=null){
                    comp.hierarchy();
                }
                else{
                    System.out.println("This company doesn't exist");
                }

            }
            if(a==5){
                System.out.println("Enter your company name");
                String b=sc.nextLine();
                Company comp=util(companyList,b);
                if(comp!=null){
                    System.out.println("Enter employee name");
                    String c=sc.nextLine();
                    boolean bool=comp.details(c);
                    if(!bool){
                        System.out.println("This employee doesn't exist in this company");
                    }
                }
                else{
                    System.out.println("This company doesn't exist");
                }
            }
            if(a==6){
                System.out.println("Enter your company name");
                String b=sc.nextLine();
                Company comp=util(companyList,b);
                if(comp!=null){
                    System.out.println("Enter manager name");
                    String c=sc.nextLine();
                    boolean bool=comp.removeManager(c);
                    if(!bool){
                        System.out.println("This manager doesn't exist in this company");
                    }

                }
                else{
                    System.out.println("This company doesn't exist");
                }
            }
            if(a==7){
                System.out.println("Enter your company name");
                String b=sc.nextLine();
                Company comp=util(companyList,b);
                if(comp!=null){
                    System.out.println("Enter developer name");
                    String c=sc.nextLine();
                    boolean bool=comp.removeDeveloper(c);
                    if(!bool){
                        System.out.println("This deliver doesn't exist in this company");
                    }

                }
                else{
                    System.out.println("This company doesn't exist");
                }
            }
            if(a==8) break;
        }

    }
}
