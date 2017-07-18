package remotemethodinvocation.example3.service.impl;

import remotemethodinvocation.example3.service.Service;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }

}
