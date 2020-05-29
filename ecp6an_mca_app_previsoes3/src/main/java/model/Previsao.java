package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Previsao implements Serializable {
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;	
	private Double temperaturaMin;
	private Double temperaturaMax;
	private Double umidadeRelAr;
	private LocalDate localDate;
	private String descricao;
	private double latitude;
	private double longitude;
	
	@OneToOne
	@JoinColumn(name="id_semana")
	private Semana semana;
	
	public Previsao() {	}	
		
	public Previsao(long id, Double temperaturaMin, Double temperaturaMax, Double umidadeRelAr,
			LocalDate localDate, String descricao, double latitude, double longitude) {
		super();
		this.id = id;
		this.temperaturaMin = temperaturaMin;
		this.temperaturaMax = temperaturaMax;
		this.umidadeRelAr = umidadeRelAr;
		this.localDate = localDate;
		this.descricao = descricao;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	

	public Semana getSemana() {
		return semana;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Double getUmidadeRelAr() {
		return umidadeRelAr;
	}
	public void setUmidadeRelAr(Double umidadeRelAr) {
		this.umidadeRelAr = umidadeRelAr;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Previsao other = (Previsao) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Previsao [id=" + id + ", temperaturaMin=" + temperaturaMin + ", temperaturaMax=" + temperaturaMax
				+ ", umidadeRelAr=" + umidadeRelAr + ", localDateTime=" + localDate + ", descricao=" + descricao
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", semana=" + semana + "]";
	}
	
	

}
