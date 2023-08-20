package pl.task.model;

import pl.task.model.Receipt;

import java.time.LocalDate;
import java.util.List;

public class ReimbursementClaim {
    private String tripDate;
    private List<Receipt> receipts;
    private int tripDurationInDays;
    private boolean disableOnSpecificDays;
    private double distanceDriven;

    public String getTripDate() {
        return tripDate;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public int getTripDurationInDays() {
        return tripDurationInDays;
    }

    public void setTripDurationInDays(int tripDurationInDays) {
        this.tripDurationInDays = tripDurationInDays;
    }

    public boolean isDisableOnSpecificDays() {
        return disableOnSpecificDays;
    }

    public void setDisableOnSpecificDays(boolean disableOnSpecificDays) {
        this.disableOnSpecificDays = disableOnSpecificDays;
    }

    public double getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(double distanceDriven) {
        this.distanceDriven = distanceDriven;
    }
}
