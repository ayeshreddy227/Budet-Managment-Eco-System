/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.FBIRole;
import Business.Role.Role;
import java.util.ArrayList;
import Business.WorkQueue.BudgetWorkRequest;

/**
 *
 * @author imperio2494
 */
public class FBI extends Organization{
    private ArrayList<BudgetWorkRequest> frauds;
    public FBI(){
        
   super(Type.FBI.getValue());
   frauds=new ArrayList<BudgetWorkRequest>();
   }

    public ArrayList<BudgetWorkRequest> getFrauds() {
        return frauds;
    }

    public void setFrauds(ArrayList<BudgetWorkRequest> frauds) {
        this.frauds = frauds;
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FBIRole());
        return roles;
    }
    
}
