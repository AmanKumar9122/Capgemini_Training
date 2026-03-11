import java.util.*;

interface BusinessService {
    void process();
}

class OrderService implements BusinessService {
    public void process() {
        System.out.println("Processing order service");
    }
}

class PaymentService implements BusinessService {
    public void process() {
        System.out.println("Processing payment service");
    }
}

class BusinessLookup {
    public BusinessService getService(String type) {
        if (type.equalsIgnoreCase("order")) {
            return new OrderService();
        }
        return new PaymentService();
    }
}

class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService service;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        service = lookup.getService(serviceType);
        service.process();
    }
}

class Client {
    BusinessDelegate delegate;

    Client(BusinessDelegate delegate) {
        this.delegate = delegate;
    }

    void doTask() {
        delegate.doTask();
    }
}

public class BusinessDelegateDemo {
    public static void main(String[] args) {
        BusinessDelegate delegate = new BusinessDelegate();
        delegate.setServiceType("order");

        Client client = new Client(delegate);
        client.doTask();

        delegate.setServiceType("payment");
        client.doTask();
    }
}