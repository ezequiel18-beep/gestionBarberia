
package persistencia;

import logica.Usuario;


public class ControladoraPersistencia {
    HorarioJpaController horaJpa = new HorarioJpaController();
    BarberoJpaController odontoJpa = new BarberoJpaController();
    ClienteJpaController clienJpa = new ClienteJpaController();
    PersonaJpaController personJpa = new PersonaJpaController();
    SecretarioJpaController secreJpa = new SecretarioJpaController();
    TurnoJpaController turnJpa = new TurnoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
    
    
}
