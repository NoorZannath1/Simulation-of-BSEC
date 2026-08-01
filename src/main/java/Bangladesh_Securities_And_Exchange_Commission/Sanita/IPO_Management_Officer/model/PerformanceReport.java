package Bangladesh_Securities_And_Exchange_Commission.Sanita.IPO_Management_Officer.model;

import java.time.LocalDate;

public class PerformanceReport {
    private String reportID, period, statistics;
    private LocalDate generatedDate;

    public PerformanceReport() {
    }

    public PerformanceReport(String reportID, String period, String statistics, LocalDate generatedDate) {
        this.reportID = reportID;
        this.period = period;
        this.statistics = statistics;
        this.generatedDate = generatedDate;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    @Override
    public String toString() {
        return "PerformanceReport{" +
                "reportID='" + reportID + '\'' +
                ", period='" + period + '\'' +
                ", statistics='" + statistics + '\'' +
                ", generatedDate=" + generatedDate +
                '}';
    }

    public boolean generateReport(String period) {
        this.period = period;
        this.generatedDate = LocalDate.now();
        System.out.println("Generating performance report for period: " + period);
        return true;
    }

    public boolean submitReport() {
        System.out.println("Submitting performance report ID: " + reportID);
        return true;
    }
}
