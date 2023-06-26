package classes;

public class Service{

    private int serviceID;
    private String serviceType;

    public void Service(int service_ID, String service_Type) {
        this.serviceID = service_ID;
        this.serviceType = service_Type;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Service{" +
                "Service_ID=" + serviceID +
                ", Service_Type='" + serviceType + '\'' +
                '}';
    }
}
