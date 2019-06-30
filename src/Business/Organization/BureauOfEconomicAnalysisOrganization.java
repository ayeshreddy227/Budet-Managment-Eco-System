/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BureauOfEconomicCommerceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class BureauOfEconomicAnalysisOrganization extends Organization{
    public BureauOfEconomicAnalysisOrganization() {
        super(Organization.Type.BureauOfEconomicAnalysis.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BureauOfEconomicCommerceRole());
        return roles;
    }
}
