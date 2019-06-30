/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.OfficeOfEnviManagement.OfficeOfEnviManagementPanel;
import Business.Organization.OfficeOfEnviManagementOrganization;
import Business.Organization.OfficeOfNuclearEnergyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.OfficeOfEnviManagement.OfficeOfEnviManagementWorkAreaJPanel;
import userInterface.OfficeOfNuclearEnergy.OfficeOfNuclearEnergyWorkAreaPanel;

/**
 *
 * @author Preetham Reddy
 */
public class OfficeOfEnviManagementRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new OfficeOfEnviManagementWorkAreaJPanel(userProcessContainer, account, (OfficeOfEnviManagementOrganization)organization, enterprise, network);
    }
}
