package kr.go.ngii.edu.main.courses.work.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 수업과정 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@XmlRootElement(name = "work")
public class Work implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 고유키. */
	private Integer idx;

	/** 수업. */
	private Integer courseId;

	/** 과정명. */
	private String workName;

	/** 과정설명. */
	private String workDesc;

	/** 과정순서. */
	private Integer workSeq;

	/** 과정팀유형. */
	private String workTeamDivision;

	/** 피노지오레이어아이디. */
	private String pinogioLayerId;

	
	/**
	 * 생성자.
	 */
	public Work() {
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
	 * 수업을 설정합니다..
	 * 
	 * @param courseId
	 *            수업
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	/**
	 * 수업을 가져옵니다..
	 * 
	 * @return 수업
	 */
	public Integer getCourseId() {
		return this.courseId;
	}

	/**
	 * 과정명을 설정합니다..
	 * 
	 * @param workName
	 *            과정명
	 */
	public void setWorkName(String workName) {
		this.workName = workName;
	}

	/**
	 * 과정명을 가져옵니다..
	 * 
	 * @return 과정명
	 */
	public String getWorkName() {
		return this.workName;
	}

	/**
	 * 과정설명을 설정합니다..
	 * 
	 * @param workDesc
	 *            과정설명
	 */
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}

	/**
	 * 과정설명을 가져옵니다..
	 * 
	 * @return 과정설명
	 */
	public String getWorkDesc() {
		return this.workDesc;
	}

	/**
	 * 과정순서을 설정합니다..
	 * 
	 * @param workSeq
	 *            과정순서
	 */
	public void setWorkSeq(Integer workSeq) {
		this.workSeq = workSeq;
	}

	/**
	 * 과정순서을 가져옵니다..
	 * 
	 * @return 과정순서
	 */
	public Integer getWorkSeq() {
		return this.workSeq;
	}

	/**
	 * 과정팀유형을 설정합니다..
	 * 
	 * @param workTeamDivision
	 *            과정팀유형
	 */
	public void setWorkTeamDivision(String workTeamDivision) {
		this.workTeamDivision = workTeamDivision;
	}

	/**
	 * 과정팀유형을 가져옵니다..
	 * 
	 * @return 과정팀유형
	 */
	public String getWorkTeamDivision() {
		return this.workTeamDivision;
	}

	/**
	 * 피노지오레이어아이디을 설정합니다..
	 * 
	 * @param pinogioLayerId
	 *            피노지오레이어아이디
	 */
	public void setPinogioLayerId(String pinogioLayerId) {
		this.pinogioLayerId = pinogioLayerId;
	}

	/**
	 * 피노지오레이어아이디을 가져옵니다..
	 * 
	 * @return 피노지오레이어아이디
	 */
	public String getPinogioLayerId() {
		return this.pinogioLayerId;
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
		Work other = (Work) obj;
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
