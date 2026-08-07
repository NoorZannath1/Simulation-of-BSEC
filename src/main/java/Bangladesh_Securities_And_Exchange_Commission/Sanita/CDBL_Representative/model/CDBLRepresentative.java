package Bangladesh_Securities_And_Exchange_Commission.Sanita.CDBL_Representative.model;

public class CDBLRepresentative {
    private String repID, cdblBranch;

    public CDBLRepresentative() {
    }

    public CDBLRepresentative(String repID, String cdblBranch) {
        this.repID = repID;
        this.cdblBranch = cdblBranch;
    }


    public String getRepID() {
        return repID;
    }

    public void setRepID(String repID) {
        this.repID = repID;
    }

    public String getCdblBranch() {
        return cdblBranch;
    }

    public void setCdblBranch(String cdblBranch) {
        this.cdblBranch = cdblBranch;
    }


    @Override
    public String toString() {
        return "CDBLRepresentative{" +
                "repID='" + repID + '\'' +
                ", cdblBranch='" + cdblBranch + '\'' +
                '}';
    }



    public SecurityRegistration registerIPOSecurities(String ipoID) {
        System.out.println("CDBL Representative " + repID + " registering securities for IPO: " + ipoID);
        return new SecurityRegistration();
    }

    public BOAccount createBOAccount(String investorID) {
        System.out.println("CDBL Representative " + repID + " creating BO Account for investor: " + investorID);
        return new BOAccount();
    }

    public boolean recordShareAllocation(String allocationID) {
        System.out.println("Recording share allocation: " + allocationID);
        return true;
    }

    public boolean updateOwnershipRecords(String boAccountNumber, int shareQty) {
        System.out.println("Updating ownership records for BO: " + boAccountNumber + " with quantity: " + shareQty);
        return true;
    }

    public String generateBOStatement(String boAccountNumber) {
        System.out.println("Generating BO Statement for: " + boAccountNumber);
        return "BO Statement for Account " + boAccountNumber;
    }

    public boolean verifyOwnership(String boAccountNumber) {
        System.out.println("Verifying ownership for BO Account: " + boAccountNumber);
        return true;
    }

    public boolean maintainDepositoryRecords(String recordID) {
        System.out.println("Maintaining depository records for ID: " + recordID);
        return true;
    }
}
