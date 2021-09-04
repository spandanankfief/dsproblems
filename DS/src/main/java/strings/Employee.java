package strings;

import java.util.Objects;

/**
 * Created by Spandana.K on 19-07-2021.
 */
public class Employee {
    private String name;
    private int empId;
    private String Dept;
    private String manager;

    public Employee(String name, int empId, String dept, String manager) {
        this.name = name;
        this.empId = empId;
        Dept = dept;
        this.manager = manager;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    //endregion

    public String toString(){
        return "[" + name + "," + manager +","+ Dept+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && name.equals(employee.name) && Dept.equals(employee.Dept) && manager.equals(employee.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId, Dept, manager);
    }
}
