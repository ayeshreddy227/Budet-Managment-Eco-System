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
import Business.Organization.Organization;
import Business.Organization.RevenueOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Army.ArmyWorkAreaJPanel;
import userInterface.Revenue.RevenueWorkAreaPanel;

/**
 *
 * @author Preetham Reddy
 */
public class RevenueRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new RevenueWorkAreaPanel(userProcessContainer, account, (RevenueOrganization)organization, enterprise, network);
    }
}
