/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Organization.Organization;

/**
 *
 * @author imperio2494
 */
public class certificateWorkRequest{
    private Organization senderOrganization;
    
    private boolean isFraud ;
    public certificateWorkRequest(){
        setCertificateWorkRequestId(randomAlphaNumeric(10));
    }
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) {
    int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
    builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
    }
    public String getCertificateWorkRequestId() {
        return certificateWorkRequestId;
    }

    public void setCertificateWorkRequestId(String certificateWorkRequestId) {
        this.certificateWorkRequestId = certificateWorkRequestId;
    }
    private String certificateWorkRequestId;

    public boolean isIsFraud() {
        return isFraud;
    }

    public void setIsFraud(boolean isFraud) {
        this.isFraud = isFraud;
    }
    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Organization senderOrganization) {
        this.senderOrganization = senderOrganization;
    }
    private String reports;

    
    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }
    
    
}
