package Bangladesh_Securities_And_Exchange_Commission.Talha.Complaint_Management_Officer.Model;

import java.time.LocalDate;

public class Resolution {
    private String resolutionId;
    private String complaintId;
    private String decisionType;
    private String certificateId;
    private LocalDate issueDate;

    public Resolution(String resolutionId, String complaintId, String decisionType, String certificateId, LocalDate issueDate) {
        this.resolutionId = resolutionId;
        this.complaintId = complaintId;
        this.decisionType = decisionType;
        this.certificateId = certificateId;
        this.issueDate = issueDate;
    }

    public String getResolutionId() {
        return resolutionId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public String getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}