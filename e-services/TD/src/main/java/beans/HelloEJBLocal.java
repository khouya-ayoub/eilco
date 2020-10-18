package beans;

import javax.ejb.Local;

@Local
public interface HelloEJBLocal {
    String direBonjour(String name);
    HelloBean direBonjourEntity(String name);
    boolean saveHello(String name);
}
