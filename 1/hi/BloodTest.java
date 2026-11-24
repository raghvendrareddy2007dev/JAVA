class BloodTest extends HealthcareServices implements HomeVisitSupported, ReportSupported
{
    BloodTest(int serviceId, String serviceName, double baseFee) {
        super(serviceId, serviceName, baseFee);
    }

    @Override
    void display() {
        System.out.println("Service ID: " + serviceId + ", Service Name: " + serviceName + ", Base Fee: " + baseFee);
    }

    public void arrangeHomeVisit(String address) {
        System.out.println("Arranging home visit for blood test at: " + address);
    }

    public void generateReport(String patientName) {
        System.out.println("Generating blood test report for: " + patientName);
    }
}
