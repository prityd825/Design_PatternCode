/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TANIM
 */
public class DepartmentComposite implements Depatment{
    public String name;
    private List<Depatment> subDepartments;
    
    public DepartmentComposite(String name){
        this.name=name;
        subDepartments = new ArrayList<>();
    }
    public void addDept(Depatment dept){
        subDepartments.add(dept);
    }
    public void removeDept(Depatment dept){
        subDepartments.remove(dept);
    }
    @Override
    public void printDepartmentName() {
        System.out.println("Department : "+name);
        for(Depatment dept : subDepartments){
            dept.printDepartmentName();
        }
    }
    
}
