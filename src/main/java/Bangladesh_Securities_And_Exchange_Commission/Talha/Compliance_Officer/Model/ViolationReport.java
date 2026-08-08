package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

import java.time.LocalDate;

public class ViolationReport {
    private String violationId;
    private String sourceDepartment;
    private String description;
    private String evidenceRef;
    private String status;


    public ViolationReport() {
    }

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

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    public String getSourceDepartment() {
        return sourceDepartment;
    }

    public void setSourceDepartment(String sourceDepartment) {
        this.sourceDepartment = sourceDepartment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvidenceRef() {
        return evidenceRef;
    }

    public void setEvidenceRef(String evidenceRef) {
        this.evidenceRef = evidenceRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ViolationReport{" +
                "violationId='" + violationId + '\'' +
                ", sourceDepartment='" + sourceDepartment + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Penalty decidePenalty(String type, float amount, LocalDate dueDate) {
        this.status = "Penalty Issued";
        return new Penalty("PEN-" + violationId, violationId, type, amount, dueDate, "Unpaid");
    }
}