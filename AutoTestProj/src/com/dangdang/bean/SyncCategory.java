package com.dangdang.bean;

import java.util.Date;

public class SyncCategory {

	private Long id;

	private Long categoryId;

	private Integer isSync;

	private Date creationTime;

	private Date lastChangedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getIsSync() {
		return isSync;
	}

	public void setIsSync(Integer isSync) {
		this.isSync = isSync;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getLastChangedTime() {
		return lastChangedTime;
	}

	public void setLastChangedTime(Date lastChangedTime) {
		this.lastChangedTime = lastChangedTime;
	}

	@Override
	public String toString() {
		return "SyncCategory [creationTime=" + creationTime + ", id=" + id
				+ ", categoryId=" + categoryId
				+ ", isSync=" + isSync + ", lastChangedTime=" + lastChangedTime
				+ "]";
	}
}