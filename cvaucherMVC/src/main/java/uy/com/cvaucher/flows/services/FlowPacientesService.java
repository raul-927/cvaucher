package uy.com.cvaucher.flows.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uy.com.cvaucher.services.domain.Agenda;
import uy.com.cvaucher.services.domain.Direccion;
import uy.com.cvaucher.services.domain.HistoriaClinica;
import uy.com.cvaucher.services.domain.Pacientes;
import uy.com.cvaucher.services.domain.TratPacByCedula;
import uy.com.cvaucher.services.domain.Tratamiento;
import uy.com.cvaucher.services.domain.TratamientoPaciente;
import uy.com.cvaucher.services.interfaces.AgendaInt;
import uy.com.cvaucher.services.interfaces.DireccionInt;
import uy.com.cvaucher.services.interfaces.HistoriaClinicaInt;
import uy.com.cvaucher.services.interfaces.PacientesInt;
import uy.com.cvaucher.services.interfaces.TratamientoInt;
import uy.com.cvaucher.services.interfaces.TratamientoPacienteInt;

@Controller
public class FlowPacientesService 
{
	private final PacientesInt 				pacientesServices;
	private final TratamientoInt			tratamientoServices;
	private final DireccionInt 				direccionServices;
	private final AgendaInt 				agendaServices;
	private final HistoriaClinicaInt		historiaClinicaServices;
	private final TratamientoPacienteInt	tratamientoPacienteServices;
	
	@Autowired
	public FlowPacientesService(PacientesInt 			pacientesServices, 
								DireccionInt 			direccionServices,
								AgendaInt 				agendaServices,
								TratamientoInt			tratamientoServices,
								HistoriaClinicaInt		historiaClinicaServices,
								TratamientoPacienteInt 	tratamientoPacienteServices)
	{
		this.pacientesServices			 = pacientesServices;
		this.tratamientoServices		 = tratamientoServices;
		this.direccionServices 			 = direccionServices;
		this.agendaServices 			 = agendaServices;
		this.historiaClinicaServices 	 = historiaClinicaServices;
		this.tratamientoPacienteServices = tratamientoPacienteServices;
	}
	
	public void insertPacientes(Pacientes pacientes)
	{
		this.pacientesServices.insertPacientes(pacientes);
	}
	
	public void insertDireccion(Direccion direccion)
	{
		this.direccionServices.insertDireccion(direccion);
	}
	
	public void insertAgenda(Agenda agenda)
	{
		this.agendaServices.insertAgenda(agenda);
	}
	
	public void insertHistoriaClinica(HistoriaClinica historiaClinica)
	{
		this.historiaClinicaServices.insertHistoriaClinica(historiaClinica);
	}
	
	public void insertTratamientoPaciente(TratamientoPaciente tratamientoPaciente)
	{
		this.tratamientoPacienteServices.insertTratamientoPaciente(tratamientoPaciente);
	}
	
	public List<Direccion>findDireccionByCedula(int pacCedula)
	{
		List<Direccion> direc = this.direccionServices.findDireccionByCedula(pacCedula);
		return direc;
	}
	
	public List<Agenda> findAgendaByCedula(int cedula)
	{
		List<Agenda>age = this.agendaServices.findAgendaByCedula(cedula);
		return age;
	}
	
	public List<TratPacByCedula> findTratamientoPacienteByCedula(int cedula)
	{
		List<TratPacByCedula> tratPac = this.tratamientoPacienteServices.findTratamientoPacienteByCedula(cedula);
		return tratPac;
	}
	
	public List<Tratamiento> findAllTratamientos()
	{
		List<Tratamiento> tratamiento =  this.tratamientoServices.findAllTratamientos();
		return tratamiento;
	}
	public Tratamiento findTratamientoById(int tratId)
	{
		return this.tratamientoServices.findTratamientoById(tratId);
	}
	public int findSesionesByTratamiento(int tratId)
	{
		return this.tratamientoServices.findSesionesByTratamientoId(tratId);
	}
	
	
}
