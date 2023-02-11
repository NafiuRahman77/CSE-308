import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee{

    public Developer(String name, String currentProject){
        this.name=name;
        this.currentProject=currentProject;
    }
    @Override
    public void printDetails(){
        System.out.println();
        System.out.println(name);
        System.out.println("Developer");
        System.out.println(currentProject);
        System.out.println();
    }

    @Override
    public void hierarchy(int i) {
        for(int j=0;j<i;j++){
            System.out.print("  ");
        }
        System.out.println("-"+name);
        System.out.println();
    }

    @Override
    public int getNumberOfSupervisee() {
        return 0;
    }


    public void addEmployee(Employee e) {

    }

    @Override
    public void removeEmployee(Employee e) {

    }
    public List<Employee> getEmployeeList() {
        return null;
    }
}
