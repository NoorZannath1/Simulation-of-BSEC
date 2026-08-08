package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Model;

public class Inspection {
    private String inspectionId;
    private String targetName;
    private String targetType;
    private String recommendation;

    public Inspection() {
    }

    public Inspection(String inspectionId, String targetName, String targetType, String recommendation) {
        this.inspectionId = inspectionId;
        this.targetName = targetName;
        this.targetType = targetType;
        this.recommendation = recommendation;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "inspectionId='" + inspectionId + '\'' +
                ", targetName='" + targetName + '\'' +
                ", targetType='" + targetType + '\'' +
                '}';
    }

    public String recommendedActions() {
        if (recommendation == null) {
            return "No recommendation recorded";
        }
        return recommendation;
    }
}