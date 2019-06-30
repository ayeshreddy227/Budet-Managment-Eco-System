/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.certificateOrgRole;
import java.util.ArrayList;
import Business.WorkQueue.BudgetWorkRequest;

/**
 *
 * @author imperio2494
 */
public class CertificateOrganization extends Organization {
    public ArrayList<BudgetWorkRequest>Orgcertificates;
    public CertificateOrganization(){
   super(Type.Certificate.getValue());
   Orgcertificates=new ArrayList<BudgetWorkRequest>();
   }

    public ArrayList<BudgetWorkRequest> getOrgcertificates() {
        return Orgcertificates;
    }

    public void setOrgcertificates(ArrayList<BudgetWorkRequest> Orgcertificates) {
        this.Orgcertificates = Orgcertificates;
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new certificateOrgRole());
        return roles;
    }
}
