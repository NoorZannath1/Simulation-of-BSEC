package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

import java.time.LocalDate;

public class Penalty {
    private String penaltyId;
    private String violationId;
    private String type;
    private float amount;
    private LocalDate dueDate;
    private String status;

    public Penalty(String penaltyId, String violationId, String type, float amount, LocalDate dueDate, String status) {
        this.penaltyId = penaltyId;
        this.violationId = violationId;
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getPenaltyId() {
        return penaltyId;
    }

    public String getViolationId() {
        return violationId;
    }

    public String getType() {
        return type;
    }

    public float getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}