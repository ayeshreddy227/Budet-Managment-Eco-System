/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.RevenueRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Preetham Reddy
 */
public class RevenueOrganization extends Organization {
    public RevenueOrganization(){
   super(Organization.Type.Revenue.getValue());
   }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RevenueRole());
        return roles;
    }
}
