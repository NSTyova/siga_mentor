package ao.co.temmais.arquitetura.modelo;

public enum PerfilTipo {
	ADMIN(1, "ADMIN"), ARQUITETOS(2, "ARQUITETOS"), CANDIDATOS(3, "CANDIDATOS"), SECRETARIA(4, "SECRETARIA");
	
	private long cod;
	private String desc;

	private PerfilTipo(long cod, String desc) {
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
