package SBL.springbootstarters;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment-service")
//so this would become the configuration file , usually people use this file to inject depenedency into their file (in this case it is paymentGateway)
public class PaymentProperties {
    private String type;
    private int retrycount;
    private boolean enabled;
    private int timeout;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRetrycount() {
        return retrycount;
    }

    public void setRetrycount(int retrycount) {
        this.retrycount = retrycount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
