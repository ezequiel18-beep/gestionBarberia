
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Persona{
    
    @OneToMany (mappedBy="client")
    private List<Turno> listaTurnos;

    public Cliente() {
    }

    public Cliente(List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.listaTurnos = listaTurnos;
    }
    
    


    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

        
        
    

   
    
    
}
