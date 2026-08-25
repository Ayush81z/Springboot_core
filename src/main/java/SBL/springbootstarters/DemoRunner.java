package SBL.springbootstarters;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
//this is class for running application runner
public class DemoRunner implements ApplicationRunner {
    private PaymentGateway paymentGateway;

    public DemoRunner(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateway.print();
    }
}
