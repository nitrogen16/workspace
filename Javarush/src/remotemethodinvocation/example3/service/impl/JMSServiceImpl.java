package remotemethodinvocation.example3.service.impl;

import remotemethodinvocation.example3.service.Service;

public class JMSServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing JMSService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }

}
