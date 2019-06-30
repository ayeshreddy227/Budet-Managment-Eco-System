/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Organization.AirForceOrganization;
import userInterface.AirForce.AirForceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class AirForceRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new AirForceWorkAreaJPanel(userProcessContainer, account, (AirForceOrganization)organization, enterprise, network);
    }
}
