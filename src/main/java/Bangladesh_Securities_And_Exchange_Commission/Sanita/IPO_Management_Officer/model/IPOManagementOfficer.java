package Bangladesh_Securities_And_Exchange_Commission.Sanita.IPO_Management_Officer.model;

import java.time.LocalDate;

public class IPOManagementOfficer {
    private String officerID, department;

    public IPOManagementOfficer() {
    }

    public IPOManagementOfficer(String officerID, String department) {
        this.officerID = officerID;
        this.department = department;
    }


    public String getOfficerID() {
        return officerID;
    }

    public void setOfficerID(String officerID) {
        this.officerID = officerID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "IPOManagementOfficer{" +
                "officerID='" + officerID + '\'' +
                ", departmnet='" + department + '\'' +
                '}';
    }


    public IPOApplication reviewIPOApplication(String applicationID) {
        System.out.println("Officer " + officerID + " reviewing IPO Application: " + applicationID);
        return new IPOApplication();
    }

    public EligibilityAssessment verifyIssuerEligibility(String applicationID) {
        System.out.println("Officer " + officerID + " verifying issuer eligibility for Application: " + applicationID);
        return new EligibilityAssessment();
    }

    public boolean approveIPO(String ipoID) {
        System.out.println("Officer " + officerID + " approved IPO: " + ipoID);
        return true;
    }

    public boolean rejectIPO(String ipoID, String reason) {
        System.out.println("Officer " + officerID + " rejected IPO: " + ipoID + " Reason: " + reason);
        return true;
    }

    public boolean publishIPOSchedule(String ipoID, LocalDate openDate, LocalDate closeDate) {
        System.out.println("Officer " + officerID + " published schedule for IPO: " + ipoID);
        return true;
    }

    public String monitorSubscription(String ipoID) {
        System.out.println("Officer " + officerID + " monitoring subscription for IPO: " + ipoID);
        return "Subscribed";
    }

    public boolean verifyShareAllocation(String allocationID) {
        System.out.println("Officer " + officerID + " verifying share allocation: " + allocationID);
        return true;
    }

    public PerformanceReport generatePerformanceReport(String period) {
        System.out.println("Officer " + officerID + " generating performance report for period: " + period);
        return new PerformanceReport();
    }
}
