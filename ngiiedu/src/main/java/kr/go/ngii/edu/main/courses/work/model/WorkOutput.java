package kr.go.ngii.edu.main.courses.work.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 과정결과물 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@XmlRootElement(name = "workOutput")
public class WorkOutput implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 고유키. */
	private Integer idx;

	/** 수업과정. */
	private Work workIdworks;

	/** 팀아이디. */
	private String outputTeamId;

	/** 사용자아이디. */
	private String outputUserid;

	/** 결과물타입. */
	private String outputDivision;

	/** 피노지오결과물아이디. */
	private String pinogioOutputId;

	/**
	 * 생성자.
	 */
	public WorkOutput() {
	}

	/**
	 * 고유키을 설정합니다..
	 * 
	 * @param idx
	 *            고유키
	 */
	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	/**
	 * 고유키을 가져옵니다..
	 * 
	 * @return 고유키
	 */
	public Integer getIdx() {
		return this.idx;
	}

	/**
	 * 수업과정을 설정합니다..
	 * 
	 * @param workIdworks
	 *            수업과정
	 */
	public void setWorkIdworks(Work workIdworks) {
		this.workIdworks = workIdworks;
	}

	/**
	 * 수업과정을 가져옵니다..
	 * 
	 * @return 수업과정
	 */
	public Work getWorkIdworks() {
		return this.workIdworks;
	}

	/**
	 * 팀아이디을 설정합니다..
	 * 
	 * @param outputTeamId
	 *            팀아이디
	 */
	public void setOutputTeamId(String outputTeamId) {
		this.outputTeamId = outputTeamId;
	}

	/**
	 * 팀아이디을 가져옵니다..
	 * 
	 * @return 팀아이디
	 */
	public String getOutputTeamId() {
		return this.outputTeamId;
	}

	/**
	 * 사용자아이디을 설정합니다..
	 * 
	 * @param outputUserid
	 *            사용자아이디
	 */
	public void setOutputUserid(String outputUserid) {
		this.outputUserid = outputUserid;
	}

	/**
	 * 사용자아이디을 가져옵니다..
	 * 
	 * @return 사용자아이디
	 */
	public String getOutputUserid() {
		return this.outputUserid;
	}

	/**
	 * 결과물타입을 설정합니다..
	 * 
	 * @param outputDivision
	 *            결과물타입
	 */
	public void setOutputDivision(String outputDivision) {
		this.outputDivision = outputDivision;
	}

	/**
	 * 결과물타입을 가져옵니다..
	 * 
	 * @return 결과물타입
	 */
	public String getOutputDivision() {
		return this.outputDivision;
	}

	/**
	 * 피노지오결과물아이디을 설정합니다..
	 * 
	 * @param pinogioOutputId
	 *            피노지오결과물아이디
	 */
	public void setPinogioOutputId(String pinogioOutputId) {
		this.pinogioOutputId = pinogioOutputId;
	}

	/**
	 * 피노지오결과물아이디을 가져옵니다..
	 * 
	 * @return 피노지오결과물아이디
	 */
	public String getPinogioOutputId() {
		return this.pinogioOutputId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idx == null) ? 0 : idx.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		WorkOutput other = (WorkOutput) obj;
		if (idx == null) {
			if (other.idx != null) {
				return false;
			}
		} else if (!idx.equals(other.idx)) {
			return false;
		}
		return true;
	}

}
