package beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "eilco", name = "HelloTable")
public class HelloBean implements Serializable {

    private int id;
    private String nom;

    @Id
    @GeneratedValue
    @Column(name = "pk_hello")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "message")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
