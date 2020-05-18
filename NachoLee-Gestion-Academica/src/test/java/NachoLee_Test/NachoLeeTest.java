package NachoLee_Test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import com.uisrael.NachoLee.Controller.MatriculasControlador;
import com.uisrael.NachoLee.Controller.impl.MatriculasControladorimpl;
import com.uisrael.NachoLee.modelo.entidades.Calificacion;
import com.uisrael.NachoLee.modelo.entidades.Cursos;
import com.uisrael.NachoLee.modelo.entidades.Materia;
import com.uisrael.NachoLee.modelo.entidades.Matriculas;
import com.uisrael.NachoLee.modelo.entidades.Rol;
import com.uisrael.NachoLee.modelo.entidades.RolUsuario;
import com.uisrael.NachoLee.modelo.entidades.Usuarios;

class NachoLeeTest {
private MatriculasControlador matriculasControlador;
	@Test
	void test() {
		System.out.println("Inicio de prueba");
		Rol nuevoRol = new Rol();
		nuevoRol.setNombre("Estudiante");
		nuevoRol.setDescripcion("Encargador de receptar conocimiento");

		Usuarios nuevoUsuario = new Usuarios();
		nuevoUsuario.setNombres("Junior Jamil");
		nuevoUsuario.setApellidos("Parraga Parraga");
		nuevoUsuario.setTipoDocumento("C");
		nuevoUsuario.setNumeroDocumento("1314002401");
		nuevoUsuario.setContraseña("1234");
		nuevoUsuario.setConfirmPassword("1234");
		nuevoUsuario.setFechaNacimiento(new Date());
		nuevoUsuario.setUsuario("jxp359");
		nuevoUsuario.setCorreo("junior1997parraga@gmail.com");

		RolUsuario nuevoRolUsuario = new RolUsuario();
		nuevoRolUsuario.setFkRol(nuevoRol);
		nuevoRolUsuario.setFkUsuario(nuevoUsuario);

		Matriculas nuevaMatricula = new Matriculas();
		nuevaMatricula.setAnoLectivo("2019-2020");

		/* Insertar las relaciones de matriculas*/
		nuevaMatricula.setFkUsuario(nuevoUsuario);

		Cursos nuevoCurso = new Cursos();
		nuevoCurso.setNombre("1ro");
		nuevoCurso.setDescripcion("Primero de básica");
		
		/* Insertar las relaciones de matriculas*/
		nuevaMatricula.setFkCurso(nuevoCurso);
		
		Materia nuevaMateria=new Materia();
		nuevaMateria.setNombre("Matemática");
		nuevaMateria.setDescripcion("Numeros y pensamiento lógico");

		/* Insertar las relaciones de materia*/
		nuevaMateria.setFkCurso(nuevoCurso);
		
		
		Calificacion nuevaCalificacion=new Calificacion();
		nuevaCalificacion.setNotaDeberes(8);
		nuevaCalificacion.setNotaTrabajos_clase(9);
		nuevaCalificacion.setNotaTrabajosGrupales(10);
		nuevaCalificacion.setNotaExamen(9);
		nuevaCalificacion.setCalificacionFinal(9);
		/* Insertar las relaciones de calificacion*/
		nuevaCalificacion.setFkMateria(nuevaMateria);
		nuevaCalificacion.setFkMatriculas(nuevaMatricula);
		try {

			matriculasControlador=new MatriculasControladorimpl();
			matriculasControlador.insertarMatriculas(nuevaMatricula);
			
			System.out.println("Paso el test");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
