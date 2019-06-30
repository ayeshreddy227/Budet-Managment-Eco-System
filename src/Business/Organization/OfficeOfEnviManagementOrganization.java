/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.OfficeOfEnviManagementRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Preetham Reddy
 */
public class OfficeOfEnviManagementOrganization extends Organization {
    public OfficeOfEnviManagementOrganization() {
        super(Type.OfficeOfEnviManagement.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OfficeOfEnviManagementRole());
        return roles;
    }
}
