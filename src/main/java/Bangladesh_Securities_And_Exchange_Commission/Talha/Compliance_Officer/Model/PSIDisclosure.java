package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

import java.time.LocalDate;

public class PSIDisclosure {
    private String disclosureId;
    private String issuerId;
    private LocalDate submissionDate;
    private String status;

    public PSIDisclosure(String disclosureId, String issuerId, LocalDate submissionDate, String status) {
        this.disclosureId = disclosureId;
        this.issuerId = issuerId;
        this.submissionDate = submissionDate;
        this.status = status;
    }

    public String getDisclosureId() {
        return disclosureId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public String getStatus() {
        return status;
    }
}
