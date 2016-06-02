package com.services.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vehicle {
	
	
	private Long vehicleId;
	private Long makeId;
	private Long chromeMakeId;
	private String makeName;
	private Long modelId;
	private Long chromeModelId;
	private String modelName;
	private Integer modelYear;
	private Long trimId;
	private Long translatedTrimId;
	private Long chromeTrimId;
	private String trimName;

	public Long getMakeId() {
		return makeId;
	}

	public void setMakeId(Long makeId) {
		this.makeId = makeId;
	}

	public Long getChromeMakeId() {
		return chromeMakeId;
	}

	public void setChromeMakeId(Long chromeMakeId) {
		this.chromeMakeId = chromeMakeId;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	public Long getModelId() {
		return modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public Long getChromeModelId() {
		return chromeModelId;
	}

	public void setChromeModelId(Long chromeModelId) {
		this.chromeModelId = chromeModelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	public Long getTrimId() {
		return trimId;
	}

	public void setTrimId(Long trimId) {
		this.trimId = trimId;
	}

	public Long getTranslatedTrimId() {
		return translatedTrimId;
	}

	public void setTranslatedTrimId(Long translatedTrimId) {
		this.translatedTrimId = translatedTrimId;
	}

	public Long getChromeTrimId() {
		return chromeTrimId;
	}

	public void setChromeTrimId(Long chromeTrimId) {
		this.chromeTrimId = chromeTrimId;
	}

	public String getTrimName() {
		return trimName;
	}

	public void setTrimName(String trimName) {
		this.trimName = trimName;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	

	
}
