package Bangladesh_Securities_And_Exchange_Commission.Talha.Complaint_Management_Officer.Model;

public class Investigation {
    private String investigationId;
    private String complaintId;
    private String ownershipRecordRef;
    private String tradeRecordRef;
    private String surveillanceFindings;

    public Investigation(String investigationId, String complaintId, String ownershipRecordRef, String tradeRecordRef, String surveillanceFindings) {
        this.investigationId = investigationId;
        this.complaintId = complaintId;
        this.ownershipRecordRef = ownershipRecordRef;
        this.tradeRecordRef = tradeRecordRef;
        this.surveillanceFindings = surveillanceFindings;
    }

    public String getInvestigationId() {
        return investigationId;
    }

    public void setInvestigationId(String investigationId) {
        this.investigationId = investigationId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getOwnershipRecordRef() {
        return ownershipRecordRef;
    }

    public void setOwnershipRecordRef(String ownershipRecordRef) {
        this.ownershipRecordRef = ownershipRecordRef;
    }

    public String getTradeRecordRef() {
        return tradeRecordRef;
    }

    public void setTradeRecordRef(String tradeRecordRef) {
        this.tradeRecordRef = tradeRecordRef;
    }

    public String getSurveillanceFindings() {
        return surveillanceFindings;
    }

    public void setSurveillanceFindings(String surveillanceFindings) {
        this.surveillanceFindings = surveillanceFindings;
    }

    @Override
    public String toString() {
        return "Investigation{" +
                "investigationId='" + investigationId + '\'' +
                ", complaintId='" + complaintId + '\'' +
                '}';
    }

    public String prepareSummary() {

        return "";
    }
}
