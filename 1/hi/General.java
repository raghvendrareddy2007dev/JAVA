class General extends HealthcareServices implements HomeVisitSupported
{
    General(int serviceId, String serviceName, double baseFee) {
        super(serviceId, serviceName, baseFee);
    }

    @Override
    void display() {
        System.out.println("Service ID: " + serviceId + ", Service Name: " + serviceName + ", Base Fee: " + baseFee);
    }

    public void arrangeHomeVisit(String address) {
        System.out.println("Arranging home visit for general healthcare at: " + address);
    }
}