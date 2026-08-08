package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

import java.time.LocalDate;

public class Penalty {
    private String penaltyId;
    private String violationId;
    private String type;
    private float amount;
    private LocalDate dueDate;
    private String status;

    public Penalty() {
    }

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

    public void setPenaltyId(String penaltyId) {
        this.penaltyId = penaltyId;
    }

    public String getViolationId() {
        return violationId;
    }

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "penaltyId='" + penaltyId + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public float applyLateFee() {
        if (dueDate == null) {
            return amount;
        }

        if (LocalDate.now().isAfter(dueDate)) {
            amount = amount * 1.10f;
        }

        return amount;
    }
}