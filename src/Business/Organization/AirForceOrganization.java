/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.AirForceRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author root
 */
public class AirForceOrganization extends Organization{
        public AirForceOrganization() {
        super(Type.AirForce.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AirForceRole());
        return roles;
    }
}
