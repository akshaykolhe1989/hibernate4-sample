package com.concretepage;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="INT_ISSACQ")
public class IntIssAcq implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IICCODE")
    private int iicCode;  
	
	@Column(name="INBOUND")
	private int inbound;

	@Column(name="OUTBOUND")
	private int outbound;
	
	
	@OneToMany(mappedBy = "intIssAcq", cascade = CascadeType.ALL)
    private List<PrtcptProf> prtcptProfList;


	public int getIicCode() {
		return iicCode;
	}


	public void setIicCode(int iicCode) {
		this.iicCode = iicCode;
	}


	public int getInbound() {
		return inbound;
	}


	public void setInbound(int inbound) {
		this.inbound = inbound;
	}


	public int getOutbound() {
		return outbound;
	}


	public void setOutbound(int outbound) {
		this.outbound = outbound;
	}


	public List<PrtcptProf> getPrtcptProfList() {
		return prtcptProfList;
	}


	public void setPrtcptProfList(List<PrtcptProf> prtcptProfList) {
		this.prtcptProfList = prtcptProfList;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iicCode;
		result = prime * result + inbound;
		result = prime * result + outbound;
		result = prime * result + ((prtcptProfList == null) ? 0 : prtcptProfList.hashCode());
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
		IntIssAcq other = (IntIssAcq) obj;
		if (iicCode != other.iicCode)
			return false;
		if (inbound != other.inbound)
			return false;
		if (outbound != other.outbound)
			return false;
		if (prtcptProfList == null) {
			if (other.prtcptProfList != null)
				return false;
		} else if (!prtcptProfList.equals(other.prtcptProfList))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "IntIssAcq [iicCode=" + iicCode + ", inbound=" + inbound + ", outbound=" + outbound + ", prtcptProfList="
				+ prtcptProfList + "]";
	}


		
}
