package details;

public class Service{

    private int Service_ID;
    private String Service_Type;

    public void Service(int service_ID, String service_Type) {
        this.Service_ID = service_ID;
        this. Service_Type = service_Type;
    }

    public int getService_ID() {
        return Service_ID;
    }

    public void setService_ID(int service_ID) {
        Service_ID = service_ID;
    }

    public String getService_Type() {
        return Service_Type;
    }

    public void setService_Type(String service_Type) {
        Service_Type = service_Type;
    }

    @Override
    public String toString() {
        return "Service{" +
                "Service_ID=" + Service_ID +
                ", Service_Type='" + Service_Type + '\'' +
                '}';
    }
}
