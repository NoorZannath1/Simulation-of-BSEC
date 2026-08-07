package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

public class ViolationReport {
    private String violationId;
    private String sourceDepartment;
    private String description;
    private String evidenceRef; // FF <-- CDBLRepresentative
    private String status;

    public ViolationReport(String violationId, String sourceDepartment, String description, String evidenceRef, String status) {
        this.violationId = violationId;
        this.sourceDepartment = sourceDepartment;
        this.description = description;
        this.evidenceRef = evidenceRef;
        this.status = status;
    }

    public String getViolationId() {
        return violationId;
    }

    public String getSourceDepartment() {
        return sourceDepartment;
    }

    public String getEvidenceRef() {
        return evidenceRef;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setEvidenceRef(String evidenceRef) {
        this.evidenceRef = evidenceRef;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
