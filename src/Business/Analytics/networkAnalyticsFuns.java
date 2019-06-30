/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.UserAccount.UserAccount;
import java.util.HashMap;
import Business.EcoSystem;
import Business.Organization.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author imperio2494
 */
public class networkAnalyticsFuns {
    private EcoSystem system;
    public networkAnalyticsFuns(EcoSystem system){
    this.system=system;
    
    
    }
    
    
    public HashMap<String,HashMap<String,Integer>> getUsersInNetWorkByOrganization(String networkSel){
        
        
        
        String temp;
        HashMap<String,HashMap<String,Integer>> ent=null;
        for(Network network:system.getNetworkList()){
             ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> org =new HashMap<String,Integer>();
                    org.put("Admins",enterprise.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                       org.put(organization.getName(),organization.getUserAccountDirectory().getUserAccountList().size()) ;
                    }
                ent.put(enterprise.getEnterpriseType().getValue(),org);
                
                }
                  
                if(temp==network.getName())
                    return ent;
                
                }
        

            System.out.print("asdf");
        return ent;
        
    
    }
    
    public DefaultCategoryDataset getAllocatedBudgetByOrganization(String networkSel){
        String temp;
        HashMap<String,HashMap<String,Integer>> ent=null;
        
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( ); 
        for(Network network:system.getNetworkList()){
             ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                        HashMap<String, Integer> Allocated_funds = new HashMap<>(); 
                        if(organization instanceof ArmyOrganization || organization instanceof AirForceOrganization || organization instanceof OfficeOfEnviManagementOrganization || organization instanceof OfficeOfNuclearEnergyOrganization){
                            for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
                                    int funds = ((BudgetWorkRequest) request).getTotalBudgetRequest();
                                    int allocated_funds = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
                                    String category = request.getCategory()==null ? "UNN" : request.getCategory();

                                    if(Allocated_funds.get(category)==null){
                                        Allocated_funds.put(category, allocated_funds);
                                    }
                                    else{
                                        Allocated_funds.put(category, Allocated_funds.get(category)+allocated_funds);
                                    }

                                }
                            }
                                for(String k: Allocated_funds.keySet()){
                                    dataset.addValue(Allocated_funds.get(k),k,organization.getName());
                                }
                        }
                    }
                
                }
                  
                if(temp==network.getName())
                    return dataset;
                
                }
        

            System.out.print("asdf");
        return dataset;
        
    
    }
    public DefaultPieDataset getTotalBudgetdistributionByOrganization(String networkSel){
        String temp;
        HashMap<String,HashMap<String,Integer>> ent=null;
        
        DefaultPieDataset dataset = new DefaultPieDataset( ); 
        for(Network network:system.getNetworkList()){
             ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                        HashMap<String, Integer> Allocated_funds = new HashMap<>(); 
                        if(organization instanceof ArmyOrganization || organization instanceof AirForceOrganization || organization instanceof OfficeOfEnviManagementOrganization || organization instanceof OfficeOfNuclearEnergyOrganization){
                            for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
                                    int funds = ((BudgetWorkRequest) request).getTotalBudgetRequest();
                                    int allocated_funds = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
                                    String category = request.getCategory()==null ? "UNN" : request.getCategory();

                                    if(Allocated_funds.get(organization.getName())==null){
                                        Allocated_funds.put(organization.getName(), allocated_funds);
                                    }
                                    else{
                                        Allocated_funds.put(organization.getName(), Allocated_funds.get(organization.getName())+allocated_funds);
                                    }

                                }
                            }
                                for(String k: Allocated_funds.keySet()){
                                    dataset.setValue(k,Allocated_funds.get(k));
                                }
                        }
                    }
                
                }
                  
                if(temp==network.getName())
                    return dataset;
                
                }
        

            System.out.print("asdf");
        return dataset;
        
    
    }
        public DefaultPieDataset getTotalFraudByOrganization(String networkSel){
        String temp;
        HashMap<String,HashMap<String,Integer>> ent=null;
        
        DefaultPieDataset dataset = new DefaultPieDataset( ); 
        for(Network network:system.getNetworkList()){
             ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                        HashMap<String, Integer> Allocated_funds = new HashMap<>(); 
                        if(organization instanceof ArmyOrganization || organization instanceof AirForceOrganization || organization instanceof OfficeOfEnviManagementOrganization || organization instanceof OfficeOfNuclearEnergyOrganization){
                            for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
                                    if(request.getCertificate().isIsFraud()){
                                        if(Allocated_funds.get(organization.getName())==null){
                                            Allocated_funds.put(organization.getName(), 1);
                                        }
                                        else{
                                            Allocated_funds.put(organization.getName(), Allocated_funds.get(organization.getName())+1);
                                        }
                                    }
                                }
                            }
                                for(String k: Allocated_funds.keySet()){
                                    dataset.setValue(k,Allocated_funds.get(k));
                                }
                        }
                    }
                
                }
                  
                if(temp==network.getName())
                    return dataset;
                
                }
        

            System.out.print("asdf");
        return dataset;
        
    
    }
    
}

//public int getAdminCountByOrg(){



