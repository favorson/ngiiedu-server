package kr.go.ngii.edu.main.courses.team.model;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 팀원 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@XmlRootElement(name = "member")
public class Member implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 고유키. */
	private Integer idx;

	/** 팀상태. */
	private String teamStatus;

	/** 팀. */
	private Integer teamId;

	/** 사용자. */
	private Integer userId;

	/**
	 * 생성자.
	 */
	public Member() {
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
	 * 팀상태을 설정합니다..
	 * 
	 * @param teamStatus
	 *            팀상태
	 */
	public void setTeamStatus(String teamStatus) {
		this.teamStatus = teamStatus;
	}

	/**
	 * 팀상태을 가져옵니다..
	 * 
	 * @return 팀상태
	 */
	public String getTeamStatus() {
		return this.teamStatus;
	}

	/**
	 * 팀을 설정합니다..
	 * 
	 * @param teamId
	 *            팀
	 */
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	/**
	 * 팀을 가져옵니다..
	 * 
	 * @return 팀
	 */
	public Integer getTeamId() {
		return this.teamId;
	}

	/**
	 * 사용자을 설정합니다..
	 * 
	 * @param userId
	 *            사용자
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 사용자을 가져옵니다..
	 * 
	 * @return 사용자
	 */
	public Integer getUserId() {
		return this.userId;
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
		Member other = (Member) obj;
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
