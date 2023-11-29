package pe.clinica.veterinariasanmarcos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.clinica.veterinariasanmarcos.Entity.Cliente;
import pe.clinica.veterinariasanmarcos.Entity.HistorialClinico;
import pe.clinica.veterinariasanmarcos.repository.HistorialClinicoRepository;
import pe.clinica.veterinariasanmarcos.service.HistorialClinicoService;

@Service
public class HistorialClinicoServicesImpl implements HistorialClinicoService{

	@Autowired
	HistorialClinicoRepository historepo;
	
	@Override
	public List<HistorialClinico> listarHistorialClinico() {
		// TODO Auto-generated method stub
		return historepo.findAll();
	}

	@Override
	public Optional<HistorialClinico> listarHistorialClinicoPorId(Integer id) {
		// TODO Auto-generated method stub
		return historepo.findById(id);
	}

	@Override
	public void guardar(HistorialClinico historialClinico) {
		historepo.save(historialClinico);
		
	}

	@Override
	public void actualizar(HistorialClinico historialClinico) {
		// TODO Auto-generated method stub
		HistorialClinico object = historepo.findById(historialClinico.getId_historialclinico()).get();
        if (object != null) {
            object.setDescripcion(historialClinico.getDescripcion());
            object.setResult_examenes(historialClinico.getResult_examenes());
            object.setTratamientos(historialClinico.getTratamientos());
            object.setObservaciones(historialClinico.getObservaciones());
            object.setFecha(historialClinico.getFecha());            
            historepo.save(object);
        }
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		historepo.deleteById(id);
	}

}
