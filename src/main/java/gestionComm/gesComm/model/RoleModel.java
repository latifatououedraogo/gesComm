package gestionComm.gesComm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoleModel {

    @Id
    private int id;
    private String libellé;

    public RoleModel() {
    }

    public RoleModel(int id, String libellé) {
        this.id = id;
        this.libellé = libellé;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }
}
