package Bangladesh_Securities_And_Exchange_Commission.Sanita.IPO_Management_Officer.model;

import java.time.LocalDate;

public class IPOApplication {
    private String applicationID, issuerID, ipoName, status;
    private LocalDate submissionDate;

    public IPOApplication() {
    }

    public IPOApplication(String applicationID, String issuerID, String ipoName, String status, LocalDate submissionDate) {
        this.applicationID = applicationID;
        this.issuerID = issuerID;
        this.ipoName = ipoName;
        this.status = status;
        this.submissionDate = submissionDate;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getIssuerID() {
        return issuerID;
    }

    public void setIssuerID(String issuerID) {
        this.issuerID = issuerID;
    }

    public String getIpoName() {
        return ipoName;
    }

    public void setIpoName(String ipoName) {
        this.ipoName = ipoName;
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

    @Override
    public String toString() {
        return "IPOApplication{" +
                "applicationID='" + applicationID + '\'' +
                ", issuerID='" + issuerID + '\'' +
                ", ipoName='" + ipoName + '\'' +
                ", status='" + status + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

    public boolean submit() {
        System.out.println("Submitting IPO Application: " + applicationID);
        return true;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Application " + applicationID + " status updated to: " + newStatus);
    }

    public String getDetails() {
        return "Application ID: " + applicationID + ", Issuer ID: " + issuerID +
                ", IPO Name: " + ipoName + ", Status: " + status + ", Date: " + submissionDate;
    }
}
