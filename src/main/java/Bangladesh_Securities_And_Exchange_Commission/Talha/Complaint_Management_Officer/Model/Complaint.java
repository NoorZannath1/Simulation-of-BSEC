package Bangladesh_Securities_And_Exchange_Commission.Talha.Complaint_Management_Officer.Model;

import java.time.LocalDate;

public class Complaint {
    private String complaintId;
    private String boAccountNumber; // Foreign Field (FF <-- Investor)
    private String category;
    private String details;
    private boolean isAnonymous;
    private String status;
    private LocalDate submissionDate;
    private String documentRef;


    public Complaint() {
    }

    public Complaint(String complaintId, String boAccountNumber, String category, String details, boolean isAnonymous, String status, LocalDate submissionDate, String documentRef) {
        this.complaintId = complaintId;
        this.boAccountNumber = boAccountNumber;
        this.category = category;
        this.details = details;
        this.isAnonymous = isAnonymous;
        this.status = status;
        this.submissionDate = submissionDate;
        this.documentRef = documentRef;
    }


    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getBoAccountNumber() {
        return boAccountNumber;
    }

    public void setBoAccountNumber(String boAccountNumber) {
        this.boAccountNumber = boAccountNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getDocumentRef() {
        return documentRef;
    }

    public void setDocumentRef(String documentRef) {
        this.documentRef = documentRef;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId='" + complaintId + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}