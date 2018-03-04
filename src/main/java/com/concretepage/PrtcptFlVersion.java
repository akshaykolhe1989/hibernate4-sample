package com.concretepage;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRTCPT_FL_VERSION")
public class PrtcptFlVersion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PRTCPT_FL_VERSION_ID")
	private int prtcptFlVersionId;

	@Column(name = "PRTCPT_ID")
	private int prtcptId;

	@ManyToOne(optional = true)
	@JoinColumn(name = "PRTCPT_ID", insertable = false, updatable = false)
	private PrtcptProf prtcptProf;

	@Column(name = "EFF_DATE")
	private java.sql.Date effDate;

	@Column(name = "EXP_DATE")
	private java.sql.Date expDate;

	public int getPrtcptFlVersionId() {
		return prtcptFlVersionId;
	}

	public void setPrtcptFlVersionId(int prtcptFlVersionId) {
		this.prtcptFlVersionId = prtcptFlVersionId;
	}

	public int getPrtcptId() {
		return prtcptId;
	}

	public void setPrtcptId(int prtcptId) {
		this.prtcptId = prtcptId;
	}

	public PrtcptProf getPrtcptProf() {
		return prtcptProf;
	}

	public void setPrtcptProf(PrtcptProf prtcptProf) {
		this.prtcptProf = prtcptProf;
	}

	public java.sql.Date getEffDate() {
		return effDate;
	}

	public void setEffDate(java.sql.Date effDate) {
		this.effDate = effDate;
	}

	public java.sql.Date getExpDate() {
		return expDate;
	}

	public void setExpDate(java.sql.Date expDate) {
		this.expDate = expDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((effDate == null) ? 0 : effDate.hashCode());
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + prtcptFlVersionId;
		result = prime * result + prtcptId;
		result = prime * result + ((prtcptProf == null) ? 0 : prtcptProf.hashCode());
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
		PrtcptFlVersion other = (PrtcptFlVersion) obj;
		if (effDate == null) {
			if (other.effDate != null)
				return false;
		} else if (!effDate.equals(other.effDate))
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (prtcptFlVersionId != other.prtcptFlVersionId)
			return false;
		if (prtcptId != other.prtcptId)
			return false;
		if (prtcptProf == null) {
			if (other.prtcptProf != null)
				return false;
		} else if (!prtcptProf.equals(other.prtcptProf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrtcptFlVersion [prtcptFlVersionId=" + prtcptFlVersionId + ", prtcptId=" + prtcptId + ", prtcptProf="
				+ prtcptProf + ", effDate=" + effDate + ", expDate=" + expDate + "]";
	}

}
