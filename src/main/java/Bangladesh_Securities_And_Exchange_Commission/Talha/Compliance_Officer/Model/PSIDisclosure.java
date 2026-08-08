package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

import java.time.LocalDate;

public class PSIDisclosure {
    private String disclosureId;
    private String issuerId;
    private LocalDate submissionDate;
    private String status;


    public PSIDisclosure() {
    }


    public PSIDisclosure(String disclosureId, String issuerId, LocalDate submissionDate, String status) {
        this.disclosureId = disclosureId;
        this.issuerId = issuerId;
        this.submissionDate = submissionDate;
        this.status = status;
    }


    public String getDisclosureId() {
        return disclosureId;
    }

    public void setDisclosureId(String disclosureId) {
        this.disclosureId = disclosureId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PSIDisclosure{" +
                "disclosureId='" + disclosureId + '\'' +
                ", issuerId='" + issuerId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public boolean checkTimeliness() {
        if (submissionDate == null) {
            this.status = "Late";
            return false;
        }

        if (submissionDate.isBefore(LocalDate.now()) || submissionDate.isEqual(LocalDate.now())) {
            this.status = "On Time";
            return true;
        } else {
            this.status = "Late";
            return false;
        }
    }
}