package SBL.springbootstarters;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    //this is a field injection takes from the property class, in this case it was paymentproperties
    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    //go to generate --> delegate methods
    public String getType() {
        return paymentProperties.getType();
    }

    public int getRetrycount() {
        return paymentProperties.getRetrycount();
    }

    public boolean isEnabled() {
        return paymentProperties.isEnabled();
    }

    public int getTimeout() {
        return paymentProperties.getTimeout();
    }

    public void print() {
        System.out.println(getType());
        System.out.println(getRetrycount());
        System.out.println(isEnabled());
        System.out.println(getTimeout());
    }

//these are the field autowired for the @Value , does the same work as the constructors
    //but doing these things individuallly would take up a lot of effort and inefficient , for that we have a class level annotation called --> @ConfigurationProperties
//    @Value("${paymentGateway.type}")
//    private String type;
//    @Value("${paymentGateway.retryCount}")
//    private int retryCount;

    //@value internally uses a autowired , and now also it acts like one by providing the dependency injection
//    public PaymentGateway(@Value("${paymentGateway.type}") String type,
//                          @Value("${paymentGateway.retryCount}")int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }

    //these are the getter and setters of the manual process above individually
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getRetryCount() {
//        return retryCount;
//    }
//
//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }


}
