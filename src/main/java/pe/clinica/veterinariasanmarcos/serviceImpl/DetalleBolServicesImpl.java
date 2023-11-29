package pe.clinica.veterinariasanmarcos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.clinica.veterinariasanmarcos.Entity.Cliente;
import pe.clinica.veterinariasanmarcos.Entity.DetalleBol;
import pe.clinica.veterinariasanmarcos.repository.DetalleBolRepository;
import pe.clinica.veterinariasanmarcos.service.DetalleBolService;

@Service
public class DetalleBolServicesImpl implements DetalleBolService {

	@Autowired
	DetalleBolRepository detarepo;
	
	@Override
	public List<DetalleBol> listarDetalleBol() {
		
		return detarepo.findAll();
	}

	@Override
	public Optional<DetalleBol> listarDetallBolPorId(Integer id) {
		
		return detarepo.findById(id);
	}

	@Override
	public void guardar(DetalleBol detalleBol) {
		// TODO Auto-generated method stub
		detarepo.save(detalleBol);
	}

	@Override
	public void actualizar(DetalleBol detalleBol) {
		// TODO Auto-generated method stub
		DetalleBol object = detarepo.findById(detalleBol.getId_detallebol()).get();
        if (object != null) {
            object.setTotal(detalleBol.getTotal());
            
            detarepo.save(object);
        }
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		detarepo.deleteById(id);
	}

}
