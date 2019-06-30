/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Preetham Reddy
 */
public class EnergyEnterprise extends Enterprise {
    public EnergyEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Energy);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
