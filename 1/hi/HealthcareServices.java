abstract class HealthcareServices {
    // Class implementation goes here
    int serviceId;
    String serviceName;
    double baseFee;
    HealthcareServices(int serviceId, String serviceName, double baseFee) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseFee = baseFee;
    }
    abstract void display();
}
interface ReportSupported {
    void generateReport(String patientName);

    default void showReportInstructions() {
        System.out.println("Download the report from CareConnect");
    }
}
interface HomeVisitSupported {
    void arrangeHomeVisit(String address);

    default void showHomeVisitInstructions() {
        System.out.println("Keep your address and phone ready");
    }
}