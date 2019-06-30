/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ArmyOrganization;
import Business.Organization.OfficeOfNuclearEnergyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Army.ArmyWorkAreaJPanel;
import userInterface.OfficeOfNuclearEnergy.OfficeOfNuclearEnergyWorkAreaPanel;

/**
 *
 * @author Preetham Reddy
 */
public class OfficeOfNuclearEnergyRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new OfficeOfNuclearEnergyWorkAreaPanel(userProcessContainer, account, (OfficeOfNuclearEnergyOrganization)organization, enterprise, network);
    }
}
