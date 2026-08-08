public class IntermediaryApplication {
    private String applicationId;
    private String brokerageHouseName;
    private String documentRef;
    private String status;
    private String applicationType;

    public IntermediaryApplication(String applicationId, String brokerageHouseName, String documentRef, String status, String applicationType) {
        this.applicationId = applicationId;
        this.brokerageHouseName = brokerageHouseName;
        this.documentRef = documentRef;
        this.status = status;
        this.applicationType = applicationType;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getBrokerageHouseName() {
        return brokerageHouseName;
    }

    public void setBrokerageHouseName(String brokerageHouseName) {
        this.brokerageHouseName = brokerageHouseName;
    }

    public String getDocumentRef() {
        return documentRef;
    }

    public void setDocumentRef(String documentRef) {
        this.documentRef = documentRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }


    @Override
    public String toString() {
        return applicationId + " - " + brokerageHouseName + " [" + applicationType + "]";
    }
}