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



	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	private String creator;

	private String label;

	@Column(name="long_desc")
	private String longDesc;

	
	@Column(name="short_desc")
	private String shortDesc;
	
	@Column(name="is_public")
	private int isPublic;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	public Abbre() {
	}
	public Abbre(String shortDesc,String longDesc,String label) {
		this.label = label;
		this.longDesc = longDesc;
		this.shortDesc = shortDesc;
		this.createDate = new Date();
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(int isPublic) {
		this.isPublic = isPublic;
	}
	@Override
	public String toString() {
		return String.format("Abbre[id:%d,shortDesc:%s, longDesc:%s, label:%s, creator:%s, createDate:%tF]", id,shortDesc,longDesc,label,creator,createDate);
	}

}