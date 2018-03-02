package com.concretepage;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="PRTCPT_PROF")
public class PrtcptProf implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRTCPT_ID")
    private int prtcptId;  
	
	@Column(name="IICCODE")
	private int iicCode;

	@OneToMany(mappedBy = "prtcptProf", cascade = CascadeType.ALL)
    private List<PrtcptFlVersion> prtcptFlVersionList;
	
	
	@ManyToOne(optional = true)
    @JoinColumn(name = "IICCODE",insertable=false, updatable=false)
    private IntIssAcq intIssAcq;


	public int getPrtcptId() {
		return prtcptId;
	}


	public void setPrtcptId(int prtcptId) {
		this.prtcptId = prtcptId;
	}


	public int getIicCode() {
		return iicCode;
	}


	public void setIicCode(int iicCode) {
		this.iicCode = iicCode;
	}


	public List<PrtcptFlVersion> getPrtcptFlVersionList() {
		return prtcptFlVersionList;
	}


	public void setPrtcptFlVersionList(List<PrtcptFlVersion> prtcptFlVersionList) {
		this.prtcptFlVersionList = prtcptFlVersionList;
	}


	public IntIssAcq getIntIssAcq() {
		return intIssAcq;
	}


	public void setIntIssAcq(IntIssAcq intIssAcq) {
		this.intIssAcq = intIssAcq;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iicCode;
		result = prime * result + ((intIssAcq == null) ? 0 : intIssAcq.hashCode());
		result = prime * result + ((prtcptFlVersionList == null) ? 0 : prtcptFlVersionList.hashCode());
		result = prime * result + prtcptId;
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
		PrtcptProf other = (PrtcptProf) obj;
		if (iicCode != other.iicCode)
			return false;
		if (intIssAcq == null) {
			if (other.intIssAcq != null)
				return false;
		} else if (!intIssAcq.equals(other.intIssAcq))
			return false;
		if (prtcptFlVersionList == null) {
			if (other.prtcptFlVersionList != null)
				return false;
		} else if (!prtcptFlVersionList.equals(other.prtcptFlVersionList))
			return false;
		if (prtcptId != other.prtcptId)
			return false;
		return true;
	}



	
}
