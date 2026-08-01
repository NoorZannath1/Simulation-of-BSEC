package Bangladesh_Securities_And_Exchange_Commission.Sanita.CDBL_Representative.model;

public class SecurityRegistration {
    private String registrationID, registrationStatus;
    String ipoID;

    public SecurityRegistration() {
    }

    public SecurityRegistration(String registrationID, String registrationStatus, String ipoID) {
        this.registrationID = registrationID;
        this.registrationStatus = registrationStatus;
        this.ipoID = ipoID;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getIpoID() {
        return ipoID;
    }

    public void setIpoID(String ipoID) {
        this.ipoID = ipoID;
    }

    @Override
    public String toString() {
        return "SecurityRegistration{" +
                "registrationID='" + registrationID + '\'' +
                ", registrationStatus='" + registrationStatus + '\'' +
                ", ipoID='" + ipoID + '\'' +
                '}';
    }

    public boolean registerSecurity(String ipoID) {
        this.ipoID = ipoID;
        System.out.println("Registering security for IPO ID: " + ipoID);
        return true;
    }

    public void updateStatus(String newStatus) {
        this.registrationStatus = newStatus;
        System.out.println("Registration status updated to: " + newStatus);
    }
}
