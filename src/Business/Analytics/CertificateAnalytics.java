/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.CertificateOrganization;
import Business.WorkQueue.BudgetWorkRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author imperio2494
 */


public class CertificateAnalytics {
    private EcoSystem system;
    public ArrayList<BudgetWorkRequest> certificaterequests;
    public CertificateAnalytics(EcoSystem system){
    this.system=system;
    }
    public ArrayList<BudgetWorkRequest> getCertificates(String networkSel){
        String temp;
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
    for(Network network:system.getNetworkList()){
        
        if(temp==network.getName()){
    
             
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CertificateOrganization){
                        return ((CertificateOrganization)organization).getOrgcertificates();
                        
                        }
                    }   }
    }
        
                }   
        return null;        
                    
    }
    
}
