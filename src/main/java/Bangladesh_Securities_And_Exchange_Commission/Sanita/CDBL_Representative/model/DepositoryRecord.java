package Bangladesh_Securities_And_Exchange_Commission.Sanita.CDBL_Representative.model;

import java.time.LocalDate;

public class DepositoryRecord {
    private String recordID, recordType;
    private LocalDate lastUpdated;


    public DepositoryRecord() {
    }

    public DepositoryRecord(String recordID, String recordType, LocalDate lastUpdated) {
        this.recordID = recordID;
        this.recordType = recordType;
        this.lastUpdated = lastUpdated;
    }


    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    @Override
    public String toString() {
        return "DepositoryRecord{" +
                "recordID='" + recordID + '\'' +
                ", recordType='" + recordType + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }


    public boolean maintainRecord() {
        this.lastUpdated = LocalDate.now();
        System.out.println("Maintaining depository record ID: " + recordID);
        return true;
    }

    public boolean validateConsistency() {
        System.out.println("Validating consistency for record ID: " + recordID);
        return true;
    }
}
