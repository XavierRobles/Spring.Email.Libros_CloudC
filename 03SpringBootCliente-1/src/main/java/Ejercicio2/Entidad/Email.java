package Ejercicio2.Entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Email {
	private int id = 0;
	private String remitente = "sin remitente asociado";
	private String destinatario = "sin destinatario asociado";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", remitente=" + remitente + ", destinatario=" + destinatario + "]";
	}
	

}
