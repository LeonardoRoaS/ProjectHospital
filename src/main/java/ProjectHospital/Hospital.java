package ProjectHospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private List<Medico> medicos;
	private List<Paciente> pacientes;

	public Hospital() {
		this.medicos = new ArrayList<>();
		this.pacientes = new ArrayList<>();
	}

	public Medico buscarMedico(String nombre){
		for(Medico medico : this.medicos){
			if(medico.getNombre().equalsIgnoreCase(nombre)){
				return medico;
			}
		}
		return null;
	}
	public boolean ContratarMedico(String nombre, int edad) {
		if (buscarMedico(nombre) == null){
			Medico medico = new Medico(nombre,edad);
			this.medicos.add(medico);
			return true;
		}
		return false;
	}


	public boolean DespedirMedico(String nombre) {
		Medico medico = this.buscarMedico(nombre);
		if (medico != null){
			this.medicos.remove(medico);
			return true;
		}
		return false;
	}

	public void RegistroPaciente(String nombre, int edad) {
		Paciente paciente = new Paciente(nombre, edad);
		this.pacientes.add(paciente);
	}

	public void MostrarMedicos(){
		for (Medico medico : this.medicos){
			System.out.println(medico.toString());
		}
	}

	public void MostrarPacientes(){
		for (Paciente paciente : this.pacientes){
			System.out.println(paciente.toString());
		}

	}

}