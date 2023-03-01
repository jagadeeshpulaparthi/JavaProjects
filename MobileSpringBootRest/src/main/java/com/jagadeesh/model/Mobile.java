package com.jagadeesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	private String mobilename;
	@Id
	private Integer modelno;
	private String cmpname;
	private Integer ram;
	private Integer rom;
	private String processor;
	public Mobile() {
		
	}
	public Mobile(String mobilename, Integer modelno, String cmpname, Integer ram, Integer rom, String processor) {
		super();
		this.mobilename = mobilename;
		this.modelno = modelno;
		this.cmpname = cmpname;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public Integer getModelno() {
		return modelno;
	}
	public void setModelno(Integer modelno) {
		this.modelno = modelno;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getRom() {
		return rom;
	}
	public void setRom(Integer rom) {
		this.rom = rom;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Mobile [mobilename=" + mobilename + ", modelno=" + modelno + ", cmpname=" + cmpname + ", ram=" + ram
				+ ", rom=" + rom + ", processor=" + processor + "]";
	}
	
}
