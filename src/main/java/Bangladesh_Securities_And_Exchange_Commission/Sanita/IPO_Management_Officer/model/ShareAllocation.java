package Bangladesh_Securities_And_Exchange_Commission.Sanita.IPO_Management_Officer.model;

public class ShareAllocation {
    private String allocationID, verificationStatus;
    String ipoID, boAccountNumber;;
    private int allocatedShares;

    public ShareAllocation() {
    }

    public ShareAllocation(String allocationID, String verificationStatus, String ipoID, String boAccountNumber, int allocatedShares) {
        this.allocationID = allocationID;
        this.verificationStatus = verificationStatus;
        this.ipoID = ipoID;
        this.boAccountNumber = boAccountNumber;
        this.allocatedShares = allocatedShares;
    }

    public String getAllocationID() {
        return allocationID;
    }

    public void setAllocationID(String allocationID) {
        this.allocationID = allocationID;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getIpoID() {
        return ipoID;
    }

    public void setIpoID(String ipoID) {
        this.ipoID = ipoID;
    }

    public String getBoAccountNumber() {
        return boAccountNumber;
    }

    public void setBoAccountNumber(String boAccountNumber) {
        this.boAccountNumber = boAccountNumber;
    }

    public int getAllocatedShares() {
        return allocatedShares;
    }

    public void setAllocatedShares(int allocatedShares) {
        this.allocatedShares = allocatedShares;
    }

    @Override
    public String toString() {
        return "ShareAllocation{" +
                "allocationID='" + allocationID + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                ", ipoID='" + ipoID + '\'' +
                ", boAccountNumber='" + boAccountNumber + '\'' +
                ", allocatedShares=" + allocatedShares +
                '}';
    }

    public boolean verifyAllocation() {
        System.out.println("Verifying allocation ID: " + allocationID);
        return true;
    }

    public boolean forwardToCDBL() {
        System.out.println("Forwarding allocation " + allocationID + " to CDBL.");
        return true;
    }
}
