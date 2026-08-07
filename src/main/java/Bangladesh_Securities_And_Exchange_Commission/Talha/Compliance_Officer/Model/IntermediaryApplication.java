package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

public class IntermediaryApplication {
    private String applicationId;
    private String brokerageHouseName;
    private String documentRef;
    private String status;

    public IntermediaryApplication(String applicationId, String brokerageHouseName, String documentRef, String status) {
        this.applicationId = applicationId;
        this.brokerageHouseName = brokerageHouseName;
        this.documentRef = documentRef;
        this.status = status;
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

    @Override
    public String toString() {
        return "IntermediaryApplication{" +
                "status='" + status + '\'' +
                ", applicationId='" + applicationId + '\'' +
                '}';
    }
}
