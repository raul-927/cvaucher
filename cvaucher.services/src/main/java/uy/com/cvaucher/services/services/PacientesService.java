package uy.com.cvaucher.services.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uy.com.cvaucher.services.clases.SearchPacientes;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.mappers.PacientesMapper;


@Service
@Transactional
public class PacientesService implements PacientesInt
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	private PacientesMapper pacientesMapper;
	
	@Override
	public List<Pacientes> findAllPacientes()
	{
		logger.debug("findAllPacientes :");
		
		List<Pacientes> pacientes = pacientesMapper.findAllPacientes();
		return pacientes;
		
	}
	
	@Override
	public Pacientes findPacientesById(int pacId)
	{
		logger.debug("findPacientesById :"+pacId);
		
		return pacientesMapper.findPacientesById(pacId);
	}
	
	@Override
	public Pacientes findPacientesByCedula(int cedula)
	{
		logger.debug("findPacientesByCedula :"+cedula);
		
		Pacientes pacientes = null;
		if(cedula ==0)
		{
			System.out.println("Cedula = 0");
			return null;
		}
		pacientes = pacientesMapper.findPacientesByCedula(cedula);
		return pacientes;
		
		
		
	}
	
	@Override
	public List<Pacientes> findPacientesByNombre(String pacNombre)
	{
		logger.debug("findPacientesByNombre :"+pacNombre);
		
		List<Pacientes> pacientes = pacientesMapper.findPacientesByNom(pacNombre);
		return pacientes;
	}
	
	@Override
	public List<Pacientes> findPacientesByApellido(String pacApellido)
	{
		logger.debug("findPacientesByApellido :"+pacApellido);
		
		List<Pacientes> pacientes = pacientesMapper.findPacientesByApellido(pacApellido);
		return pacientes;
	}
	
	@Override
	public void insertPacientes(Pacientes pacientes)
	{
		logger.debug("insertPacientes :"+pacientes);
		
		pacientesMapper.insertPacientes(pacientes);
	}
	
	@Override
	public void updatePacientes(Pacientes pacientes)
	{
		logger.debug("updatePacientes :"+pacientes);
		
		pacientesMapper.updatePacientes(pacientes);
	}
	
	@Override
	public void deletePacientes(int pacId)
	{
		logger.debug("deletePacientes :"+pacId);
		
		pacientesMapper.deletePacientes(pacId);
	}

	@Override
	public List<Pacientes> findPacientes(SearchPacientes searchPacientes){
		logger.debug("findPacientes :"+ searchPacientes);
		List<Pacientes> pacientes = null;
		
		if(searchPacientes.getCedula()!=0){
			 pacientes =  pacientesMapper.findPacientesByCedulaList(searchPacientes.getCedula());
		}
		else if(searchPacientes.getCedula() == 0 
				&& !searchPacientes.getPacNombre().equals("") 
				&& searchPacientes.getPacApellido().equals("")){
			pacientes = pacientesMapper.findPacientesByNom(searchPacientes.getPacNombre());
		}
		else if(searchPacientes.getCedula() == 0  
				&& searchPacientes.getPacNombre().equals("") 
				&& !searchPacientes.getPacApellido().equals("")){
			
			pacientes = pacientesMapper.findPacientesByApellido(searchPacientes.getPacApellido());
		}
		else if(searchPacientes.getCedula() == 0 
				&& !searchPacientes.getPacNombre().equals("")
				&& !searchPacientes.getPacApellido().equals("")){
			
			pacientes = pacientesMapper.findPacientesByNombreAndApellido(searchPacientes.getPacNombre(), searchPacientes.getPacApellido());
		}
		else if(searchPacientes.getCedula()== 0 
				&& searchPacientes.getPacNombre().equals("") 
				&& searchPacientes.getPacApellido().equals("")){
			
			pacientes = pacientesMapper.findAllPacientes();
		}
		
		return pacientes;
		
	}

	@Override
	public List<Pacientes> findPacientesByNombreAndApellido(String pacNombre,
			String pacApellido) {
		
		List<Pacientes> pacientes = pacientesMapper.findPacientesByNombreAndApellido(pacNombre, pacApellido);
		
		return pacientes;
	}

	@Override
	public void deletePacientesByCedula(int cedula) {
		pacientesMapper.deletePacientesByCedula(cedula);
		
	}
	
	
}
