package Bangladesh_Securities_And_Exchange_Commission.Sanita.IPO_Management_Officer.model;

import java.time.LocalDate;

public class IPO {
    private String ipoID, name, approvalStatus;
    private LocalDate openingDate, closingDate;
    private int shareQuantity;
    private double sharePrice;

    public IPO() {
    }

    public IPO(LocalDate openingDate, String ipoID, String name, String approvalStatus, LocalDate closingDate, int shareQuantity, double sharePrice) {
        this.openingDate = openingDate;
        this.ipoID = ipoID;
        this.name = name;
        this.approvalStatus = approvalStatus;
        this.closingDate = closingDate;
        this.shareQuantity = shareQuantity;
        this.sharePrice = sharePrice;
    }

    public String getIpoID() {
        return ipoID;
    }

    public void setIpoID(String ipoID) {
        this.ipoID = ipoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    public int getShareQuantity() {
        return shareQuantity;
    }

    public void setShareQuantity(int shareQuantity) {
        this.shareQuantity = shareQuantity;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "IPO{" +
                "ipoID='" + ipoID + '\'' +
                ", name='" + name + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", openingDate=" + openingDate +
                ", closingDate=" + closingDate +
                ", shareQuantity=" + shareQuantity +
                ", sharePrice=" + sharePrice +
                '}';
    }

    public boolean approve() {
        this.approvalStatus = "Approved";
        System.out.println("IPO " + ipoID + " has been approved.");
        return true;
    }

    public boolean reject(String reason) {
        this.approvalStatus = "Rejected";
        System.out.println("IPO " + ipoID + " rejected. Reason: " + reason);
        return true;
    }

    public boolean publishSchedule(LocalDate openDate, LocalDate closeDate) {
        this.openingDate = openDate;
        this.closingDate = closeDate;
        System.out.println("IPO " + ipoID + " schedule published: " + openDate + " to " + closeDate);
        return true;
    }
}
