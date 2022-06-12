package com.cmm.sbcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_claim_templates")
public class Claim {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "status_id")
	private Integer statusId;
	
	@Column(name = "status_name")
	private String statusName;
	
	@Column(name = "substatus_name")
	private String substatusName;
	
	@Column(name = "drafted_message")	
	private String draftedMessage;
	
	@Column(name = "sub_status_sec")	
	private String substatusSec;
	
	@Column(name = "keywords_list")	
	private String keywordsList;

	public Claim() {
		// TODO Auto-generated constructor stub
	}
	
	public Claim(Integer statusId, String statusName, String substatusName, String draftedMessage, String substatusSec,
			String keywordsList) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.substatusName = substatusName;
		this.draftedMessage = draftedMessage;
		this.substatusSec = substatusSec;
		this.keywordsList = keywordsList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getSubstatusName() {
		return substatusName;
	}

	public void setSubstatusName(String substatusName) {
		this.substatusName = substatusName;
	}

	public String getDraftedMessage() {
		return draftedMessage;
	}

	public void setDraftedMessage(String draftedMessage) {
		this.draftedMessage = draftedMessage;
	}

	public String getSubstatusSec() {
		return substatusSec;
	}

	public void setSubstatusSec(String substatusSec) {
		this.substatusSec = substatusSec;
	}

	public String getKeywordsList() {
		return keywordsList;
	}

	public void setKeywordsList(String keywordsList) {
		this.keywordsList = keywordsList;
	}

	@Override
	public String toString() {
		return "Claim [id=" + id + ", statusId=" + statusId + ", statusName=" + statusName + ", substatusName="
				+ substatusName + ", draftedMessage=" + draftedMessage + ", substatusSec=" + substatusSec
				+ ", keywordsList=" + keywordsList + "]";
	}
	
}
