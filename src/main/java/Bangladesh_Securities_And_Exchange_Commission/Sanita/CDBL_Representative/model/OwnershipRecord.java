package Bangladesh_Securities_And_Exchange_Commission.Sanita.CDBL_Representative.model;

import java.time.LocalDate;

public class OwnershipRecord {
    private String recordID;
    String boAccountNumber;
    private int shareQty;
    private LocalDate lastUpdated;

    public OwnershipRecord() {
    }

    public OwnershipRecord(String recordID, String boAccountNumber, int shareQty, LocalDate lastUpdated) {
        this.recordID = recordID;
        this.boAccountNumber = boAccountNumber;
        this.shareQty = shareQty;
        this.lastUpdated = lastUpdated;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getBoAccountNumber() {
        return boAccountNumber;
    }

    public void setBoAccountNumber(String boAccountNumber) {
        this.boAccountNumber = boAccountNumber;
    }

    public int getShareQty() {
        return shareQty;
    }

    public void setShareQty(int shareQty) {
        this.shareQty = shareQty;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    @Override
    public String toString() {
        return "OwnershipRecord{" +
                "recordID='" + recordID + '\'' +
                ", boAccountNumber='" + boAccountNumber + '\'' +
                ", shareQty=" + shareQty +
                ", lastUpdated=" + lastUpdated +
                '}';
    }


    public boolean updateOwnership(int shareQty) {
        this.shareQty = shareQty;
        this.lastUpdated = LocalDate.now();
        System.out.println("Updated share quantity to: " + shareQty + " for Record ID: " + recordID);
        return true;
    }

    public boolean transferOwnership(String toAccount) {
        System.out.println("Transferring ownership from " + boAccountNumber + " to " + toAccount);
        this.lastUpdated = LocalDate.now();
        return true;
    }
}
