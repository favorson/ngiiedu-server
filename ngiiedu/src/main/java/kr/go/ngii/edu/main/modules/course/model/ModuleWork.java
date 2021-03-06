package kr.go.ngii.edu.main.modules.course.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 모듈과정 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@XmlRootElement(name = "moduleWork")
public class ModuleWork implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 고유키. */
	private Integer idx;

	/** 모듈. */
	private Integer moduleId;

	/** 과정명. */
	private String moduleWorkName;

	/** 과정메타데이터. */
	private String moduleWorkMetadata;

	/**
	 * 생성자.
	 */
	public ModuleWork() {
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
	 * 모듈을 설정합니다..
	 * 
	 * @param moduleId
	 *            모듈
	 */
	public void setModuleIdmodules(Integer moduleId) {
		this.moduleId = moduleId;
	}

	/**
	 * 모듈을 가져옵니다..
	 * 
	 * @return 모듈
	 */
	public Integer getModuleId() {
		return this.moduleId;
	}

	/**
	 * 과정명을 설정합니다..
	 * 
	 * @param moduleWorkName
	 *            과정명
	 */
	public void setModuleWorkName(String moduleWorkName) {
		this.moduleWorkName = moduleWorkName;
	}

	/**
	 * 과정명을 가져옵니다..
	 * 
	 * @return 과정명
	 */
	public String getModuleWorkName() {
		return this.moduleWorkName;
	}

	/**
	 * 과정메타데이터을 설정합니다..
	 * 
	 * @param moduleWorkMetadata
	 *            과정메타데이터
	 */
	public void setModuleWorkMetadata(String moduleWorkMetadata) {
		this.moduleWorkMetadata = moduleWorkMetadata;
	}

	/**
	 * 과정메타데이터을 가져옵니다..
	 * 
	 * @return 과정메타데이터
	 */
	public String getModuleWorkMetadata() {
		return this.moduleWorkMetadata;
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
		ModuleWork other = (ModuleWork) obj;
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
