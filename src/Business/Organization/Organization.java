/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private String orgCertificateId;
    
   
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) {
    int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
    builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
    }
    public String getOrgCertificateId() {
        return orgCertificateId;
    }

    public void setOrgCertificateId(String orgCertificateId) {
        this.orgCertificateId = orgCertificateId;
    }
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), 
        Lab("Lab Organization"), Army("Army Organization"), 
        Navy("Navy Organization"), AirForce("AirForce Organization"),
        PatentAndLicenses("PatentAndLicenses Organization"),
        BureauOfEconomicAnalysis("BureauOfEconomicAnalysis Organization"),
        Certificate("Certificate Organization"),
        FBI("FBI Organization"),
        OfficeOfJustice("OfficeOfJustice Organization"), Revenue("Revenue Organization"),
        Budget("Budget Organization"), 
        OfficeOfNuclearEnergy("OfficeOfNuclearEnergy Organization"),
        OfficeOfEnviManagement("OfficeOfEnviManagement Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        setOrgCertificateId(randomAlphaNumeric(6));
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
