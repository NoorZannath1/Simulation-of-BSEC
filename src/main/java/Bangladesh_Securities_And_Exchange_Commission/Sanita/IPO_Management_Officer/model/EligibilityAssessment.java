package Bangladesh_Securities_And_Exchange_Commission.Sanita.IPO_Management_Officer.model;

public class EligibilityAssessment {
    private String assessmentID,remarks;
    String applicationID;
    private boolean result;

    public EligibilityAssessment() {
    }

    public EligibilityAssessment(String assessmentID, String remarks, String applicationID, boolean result) {
        this.assessmentID = assessmentID;
        this.remarks = remarks;
        this.applicationID = applicationID;
        this.result = result;
    }

    public String getAssessmentID() {
        return assessmentID;
    }

    public void setAssessmentID(String assessmentID) {
        this.assessmentID = assessmentID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "EligibilityAssessment{" +
                "assessmentID='" + assessmentID + '\'' +
                ", remarks='" + remarks + '\'' +
                ", applicationID='" + applicationID + '\'' +
                ", result=" + result +
                '}';
    }

    public boolean verifyEligibility(String applicationID) {
        System.out.println("Verifying eligibility for Application ID: " + applicationID);
        return this.result;
    }
}
