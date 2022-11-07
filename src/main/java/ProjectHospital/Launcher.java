package ProjectHospital;

public class Launcher {

	public static void main(String[] args) {
		ProjectHospital.Launcher launcher = new ProjectHospital.Launcher();
		launcher.Inicializar();
	}

	public void Inicializar() {
		Hospital hospital = new Hospital();
		hospital.RegistroPaciente("Eduardo", 20);
		hospital.ContratarMedico("Leonardo", 19);
		hospital.ContratarMedico("Miguel", 39);
		hospital.DespedirMedico("Leonardo");
		System.out.println("=== MEDICOS ===");
		hospital.MostrarMedicos();
		System.out.println("=== PACIENTES ===");
		hospital.MostrarPacientes();


	}

}