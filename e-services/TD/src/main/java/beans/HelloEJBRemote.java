package beans;

import javax.ejb.Remote;

@Remote
public interface HelloEJBRemote {
    public String direBonjour(String name);
}
