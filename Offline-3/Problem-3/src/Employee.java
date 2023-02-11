import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    String name;
    String currentProject;
    public abstract void addEmployee(Employee e);

    public abstract List<Employee> getEmployeeList() ;

    public abstract void removeEmployee(Employee e);
    public abstract void printDetails();
    public abstract void hierarchy(int i);
    public abstract int getNumberOfSupervisee();

    public String getName() {
        return name;
    }

    public String getCurrentProject() {
        return currentProject;
    }
}
