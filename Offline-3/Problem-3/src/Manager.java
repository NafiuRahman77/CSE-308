import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager extends Employee{

    List<Employee> employeeList=new ArrayList<>();
    int numberOfSupervisee;
    public Manager(String name, String currentProject){
        this.name=name;
        this.currentProject=currentProject;
    }

    public void addEmployee(Employee e){
        employeeList.add(e);
    }
    @Override
    public void removeEmployee(Employee e){
        employeeList.remove(e);
    }
    @Override
    public void printDetails(){
        System.out.println("-"+name);
        System.out.println("Project Manager");
        System.out.println(currentProject);
        System.out.println("No of supervisees : " + employeeList.size());
        System.out.println();
    }

    @Override
    public void hierarchy(int i) {
        for(int j=0;j<i;j++){
            System.out.print("  ");
        }
        System.out.println("-"+name);
        Iterator<Employee> it=employeeList.iterator();
        while(it.hasNext()){
            Employee employee=it.next();
            employee.hierarchy(i+1);
        }

    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public int getNumberOfSupervisee(){
        return employeeList.size();
    }
}
