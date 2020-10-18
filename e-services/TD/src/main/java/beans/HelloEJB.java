package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class HelloEJB implements HelloEJBRemote, HelloEJBLocal{

    @PersistenceContext
    EntityManager mh;

    public HelloEJB() { }

    @Override
    public String direBonjour(String name) {
        System.out.println("EJB : preparation du message pour " + name);
        return "Bonjour " + name;
    }

    public HelloBean direBonjourEntity(String name) {
        Query q = mh.createQuery("SELECT h FROM HelloBean h");
        HelloBean helloBean = (HelloBean) q.getSingleResult();
        return helloBean;
    }

    public boolean saveHello(String name) {
        HelloBean helloBean = new HelloBean();
        helloBean.setNom("Message " + name);
        mh.persist(helloBean);
        return true;
    }
}
