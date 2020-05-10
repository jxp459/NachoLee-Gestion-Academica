package NachoLee_Test;

import org.junit.jupiter.api.Test;

import com.uisrael.NachoLee.Controller.RolControlador;
import com.uisrael.NachoLee.Controller.impl.RolControladorimpl;
import com.uisrael.NachoLee.modelo.entidades.Rol;

class NachoLeeTest {
	private RolControlador rolControlador;

	@Test
	void test() {
		System.out.println("Inicio de prueba");
		Rol nuevoRol = new Rol();
		nuevoRol.setNombre("Representante");
		
		nuevoRol.setDescripcion("Encargado de hacer cumplir con sus tareas al estudiante");
		try {
			rolControlador = new RolControladorimpl();
			rolControlador.insertarRol(nuevoRol);
			System.out.println("Fin de prueba");
		} catch (Exception e) {
			System.out.println("Informacion: "+nuevoRol);
			System.out.println("Error: "+e.getMessage());
		}

		
	}

}
