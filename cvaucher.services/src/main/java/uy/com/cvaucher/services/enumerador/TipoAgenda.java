package uy.com.cvaucher.services.enumerador;

public enum TipoAgenda 
{
	
	CELULAR(1), TELEFONO(2), EMAIL(3), FACEBOOK(4), SKYPE(5), WHATSAPP(6);
	private int tpo;
	
	TipoAgenda(int tpo)
	{
		this.tpo = tpo;
	}
	
	public int getTipoAgenda()
	{
		return this.tpo;
	}
}
