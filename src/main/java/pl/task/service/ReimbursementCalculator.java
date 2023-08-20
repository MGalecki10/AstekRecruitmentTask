package pl.task.service;

import pl.task.model.Receipt;
import pl.task.model.ReimbursementClaim;

public class ReimbursementCalculator {
    public double calculateReimbursement(ReimbursementClaim claim) {
        double totalReimbursement = 0;

        for (Receipt receipt : claim.getReceipts()) {
            totalReimbursement += receipt.getAmount();
        }
        double dailyAllowance = 0;
        if(claim.isDisableOnSpecificDays()) {
            dailyAllowance = Rates.DAILY_ALLOWANCE.getValue() * claim.getTripDurationInDays();
        }
        double mileageReimbursement = Rates.MILEAGE.getValue() * claim.getDistanceDriven();
        return totalReimbursement + dailyAllowance + mileageReimbursement;
    }
}

