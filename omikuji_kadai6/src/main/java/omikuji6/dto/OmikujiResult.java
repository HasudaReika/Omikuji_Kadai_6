package omikuji6.dto;

import java.time.LocalDate;

public class OmikujiResult {
	
	private String omikujiCode;
	private LocalDate birthday;
	private LocalDate fortuneTellingDate;
	private String fortuneName;
	private String negaigoto;
	private String akinai;
	private String gakumon;
	private LocalDate updatedDate;
	private LocalDate createdDate;

	public String getOmikujiCode() {
		return omikujiCode;
	}

	public void setOmikujiCode(String omikujiCode) {
		this.omikujiCode = omikujiCode;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public LocalDate getFortuneTellingDate() {
		return fortuneTellingDate;
	}

	public void setFortuneTellingDate(LocalDate fortuneTellingDate) {
		this.fortuneTellingDate = fortuneTellingDate;
	}

	public String getFortuneName() {
		return fortuneName;
	}

	public void setFortuneName(String fortuneName) {
		this.fortuneName = fortuneName;
	}

	public String getNegaigoto() {
		return negaigoto;
	}

	public void setNegaigoto(String negaigoto) {
		this.negaigoto = negaigoto;
	}

	public String getAkinai() {
		return akinai;
	}

	public void setAkinai(String akinai) {
		this.akinai = akinai;
	}

	public String getGakumon() {
		return gakumon;
	}

	public void setGakumon(String gakumon) {
		this.gakumon = gakumon;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	//引数なしのコンストラクタ
	public OmikujiResult() {
		
	}

	
	//コンストラクタで値を取得
	public OmikujiResult(LocalDate fortuneTellingDate, String fortuneName, String negaigoto, String akinai,
			String gakumon, String omikujiCode) {
		this.fortuneTellingDate = fortuneTellingDate;
		this.fortuneName = fortuneName;
		this.negaigoto = negaigoto;
		this.akinai = akinai;
		this.gakumon = gakumon;
		this.omikujiCode = omikujiCode;

	}
}
