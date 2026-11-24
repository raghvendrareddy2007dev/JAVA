
class HealthcareServiceManager {

    // Class implementation goes here
    void search(int serviceId) {
        if (serviceId instanceof HealthcareService[]) {
            System.out.println("Service found: " + serviceId);
        } else {
            System.out.println("Service not found: " + serviceId);
        }
    }

    void search(String serviceName) {
        for(HealthcareServices service : services) {
            if (service.serviceName.equalsIgnoreCase(serviceName)) {
                System.out.println("Service found: " + serviceName);
                return;
            }
        }   
    }
}

class Main {

    public static void main(String[] args) {
        HealthcareServices[] services = {
            new BloodTest(101, "Blood Test", 500),
            new General(102, "General Consultation", 300)
        };
    }
}
