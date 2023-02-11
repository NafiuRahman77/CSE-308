import java.util.ArrayList;
import java.util.List;

public class Company {
    String name;
    List<Employee> projectList=new ArrayList<>();

    public List<Employee> getProjectList() {
        return projectList;
    }

    Company(String name, List<Employee> projectList ){
        this.name=name;
        this.projectList=projectList;
    }
    Company(String name ){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    private void printhelper(List<Employee> list, int i){
        for(Employee e: list){
            e.hierarchy(i);
        }
    }
    public boolean details(String name){
        System.out.println(projectList.size());
        for(int i=0;i<projectList.size();i++){
            if(projectList.get(i).getName().equalsIgnoreCase(name)){
                projectList.get(i).printDetails();
                return true;
            }
            List<Employee> lst=projectList.get(i).getEmployeeList();

            for(int j=0;j<lst.size();j++){
                if(lst.get(j).getName().equalsIgnoreCase(name)){
                    lst.get(j).printDetails();
                    return true;
                }
            }


        }
        return false;
    }
    public void hierarchy(){
        System.out.println("-" + this.name);
        System.out.println();
        printhelper(projectList, 1);
    }
    public void addEmployee(Employee e){
        projectList.add(e);
    }
    public boolean removeManager(String s){
        for(int i=0;i<projectList.size();i++){
            if(projectList.get(i).getNumberOfSupervisee()>0 && projectList.get(i).getName().equalsIgnoreCase(s) ){
                System.out.println("You can't remove a manager without removing the developers first");
                return true;
            }
            if(projectList.get(i).getName().equalsIgnoreCase(s)){
                projectList.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean removeDeveloper(String s){
        for(int i=0;i<projectList.size();i++){
            List<Employee> lst=projectList.get(i).getEmployeeList();
            for(int j=0;j<lst.size();j++){
                if(lst.get(j).getName().equalsIgnoreCase(s)){
                    lst.remove(j);
                    return true;
                }
            }
        }
        return false;
    }

}
