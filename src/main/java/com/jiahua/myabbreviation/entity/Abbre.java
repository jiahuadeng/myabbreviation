package com.jiahua.myabbreviation.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the abbre database table.
 * 
 */
@Entity
@NamedQuery(name="Abbre.findAll", query="SELECT a FROM Abbre a")
public class Abbre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	private String creator;

	private String label;

	@Column(name="long_desc")
	private String longDesc;

	@Column(name="short_desc")
	private String shortDesc;

	public Abbre() {
	}
	public Abbre(String shortDesc,String longDesc,String label) {
		this.label = label;
		this.longDesc = longDesc;
		this.shortDesc = shortDesc;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLongDesc() {
		return this.longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

}