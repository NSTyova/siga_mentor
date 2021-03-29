package ao.co.temmais.arquitetura.modelo;

public enum Sexo {

MASCULINO(1, "Masculino"), FEMENINO(2, "Femenino");
	
	private long cod;
	private String desc;

	private Sexo(long cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public long getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
}
