package Bangladesh_Securities_And_Exchange_Commission.Sanita.CDBL_Representative.model;

import java.time.LocalDate;

public class BOAccount {
    private String boAccountNumber, investorID, status;
    private LocalDate createdDate;

    public BOAccount() {
    }

    public BOAccount(String boAccountNumber, String investorID, String status, LocalDate createdDate) {
        this.boAccountNumber = boAccountNumber;
        this.investorID = investorID;
        this.status = status;
        this.createdDate = createdDate;
    }

    public String getBoAccountNumber() {
        return boAccountNumber;
    }

    public void setBoAccountNumber(String boAccountNumber) {
        this.boAccountNumber = boAccountNumber;
    }

    public String getInvestorID() {
        return investorID;
    }

    public void setInvestorID(String investorID) {
        this.investorID = investorID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "BOAccount{" +
                "boAccountNumber='" + boAccountNumber + '\'' +
                ", investorID='" + investorID + '\'' +
                ", status='" + status + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public boolean createAccount(String investorID) {
        this.investorID = investorID;
        this.createdDate = LocalDate.now();
        this.status = "Active";
        System.out.println("BO Account created for Investor ID: " + investorID);
        return true;
    }

    public boolean verifyAccount() {
        System.out.println("Verifying BO Account Number: " + boAccountNumber);
        return "Active".equalsIgnoreCase(this.status);
    }
}
