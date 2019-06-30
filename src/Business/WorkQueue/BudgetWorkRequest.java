/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

/**
 *
 * @author Preetham Reddy
 */
public class BudgetWorkRequest extends WorkRequest{
    private int totalBudgetRequest;
    private int allocatedBudgetRequest;
    private int budgetSpent;
    private int suggestedBudgetByBureauOfEconomics;

    public int getSuggestedBudgetByBureauOfEconomics() {
        return suggestedBudgetByBureauOfEconomics;
    }

    public void setSuggestedBudgetByBureauOfEconomics(int suggestedBudgetByBureauOfEconomics) {
        this.suggestedBudgetByBureauOfEconomics = suggestedBudgetByBureauOfEconomics;
    }

    public int getBudgetSpent() {
        return budgetSpent;
    }

    public void setBudgetSpent(int budgetSpent) {
        this.budgetSpent = budgetSpent;
    }

    public int getTotalBudgetRequest() {
        return totalBudgetRequest;
    }

    public void setTotalBudgetRequest(int totalBudgetRequest) {
        this.totalBudgetRequest = totalBudgetRequest;
    }

    public int getAllocatedBudgetRequest() {
        return allocatedBudgetRequest;
    }

    public void setAllocatedBudgetRequest(int allocatedBudgetRequest) {
        this.allocatedBudgetRequest = allocatedBudgetRequest;
    }
    
}
