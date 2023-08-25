/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Composite;
public class Main {
    public static void main(String[] args) {
        Depatment emplyee1 = new EmployeeLeaf("Tahsin","HR");
        Depatment emplyee2 = new EmployeeLeaf("Wakil","HR");
        Depatment emplyee3 = new EmployeeLeaf("Mamun","IT");
        Depatment emplyee4 = new EmployeeLeaf("Sayeed","IT");
        
        DepartmentComposite HR = new DepartmentComposite("HR");
        DepartmentComposite IT = new DepartmentComposite("IT");
        DepartmentComposite ceo = new DepartmentComposite("CEO");
        
        HR.addDept(emplyee1);
        HR.addDept(emplyee2);
        IT.addDept(emplyee3);
        IT.addDept(emplyee4);
        
        ceo.addDept(HR);
        ceo.addDept(IT);
        ceo.printDepartmentName();
        
        
    }
    
}
