package uy.com.cvaucher.services.services;

import java.util.List;

import uy.com.cvaucher.services.domain.JornadaLaboral;
import uy.com.cvaucher.services.interfaces.JornadaLaboralInt;
import uy.com.cvaucher.services.mappers.JornadaLaboralMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JornadaLaboralService implements JornadaLaboralInt {
	
	
	@Autowired
	private JornadaLaboralMapper jornadaLaboralMapper;

	@Override
	public List<JornadaLaboral> showJornadaLaboral(JornadaLaboral jornadaLaboral) {
		// TODO Auto-generated method stub
		return jornadaLaboralMapper.showJornadaLaboral(jornadaLaboral);
	}

	@Override
	public void insertarJornadaLaboral(JornadaLaboral jornadaLaboral) {
		// TODO Auto-generated method stub
		jornadaLaboralMapper.insertJornadaLaboral(jornadaLaboral);
	}


}
