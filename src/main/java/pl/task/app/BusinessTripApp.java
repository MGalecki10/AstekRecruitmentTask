package pl.task.app;

import pl.task.model.Receipt;
import pl.task.model.ReimbursementClaim;
import pl.task.service.ReimbursementCalculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessTripApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Receipt> receipts = new ArrayList<>();

        System.out.print("Enter trip date: ");
        String tripDate = scanner.nextLine();

        while (true) {
            System.out.print("Enter receipt type (or 'done' to finish): ");
            String receiptType = scanner.nextLine();
            if (receiptType.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter receipt amount: ");
            double receiptAmount = Double.parseDouble(scanner.nextLine());
            receipts.add(new Receipt(receiptType, receiptAmount));
        }

        System.out.print("Enter number of days of trip: ");
        int daysOfTrip = Integer.parseInt(scanner.nextLine());

        System.out.print("Disable on specific days? (true/false): ");
        boolean disableOnSpecificDays = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter distance driven: ");
        double distanceDriven = Double.parseDouble(scanner.nextLine());

        ReimbursementClaim claim = new ReimbursementClaim();
        claim.setTripDate(tripDate);
        claim.setReceipts(receipts);
        claim.setTripDurationInDays(daysOfTrip);
        claim.setDisableOnSpecificDays(disableOnSpecificDays);
        claim.setDistanceDriven(distanceDriven);

        ReimbursementCalculator calculator = new ReimbursementCalculator();
        double reimbursementAmount = calculator.calculateReimbursement(claim);
        System.out.println("Total reimbursement amount: $" + reimbursementAmount);
    }
}
