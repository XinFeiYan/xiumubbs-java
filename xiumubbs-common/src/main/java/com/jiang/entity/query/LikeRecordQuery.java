package com.jiang.entity.query;

import java.time.LocalDateTime;


/**
 * @Description(描述):点赞记录
 * @author:这玩意真没必要
 * @date(日期):2023/10/14
 */
public class LikeRecordQuery extends BaseQuery {
	/**
     * @Description(描述):自增ID
	 */
	private Integer opId;

	/**
     * @Description(描述):操作类型0:文章点赞 1:评论点赞
	 */
	private Integer opType;

	/**
     * @Description(描述):主体ID
	 */
	private String objectId;

	private String objectIdFuzzy;

	/**
     * @Description(描述):用户ID
	 */
	private String userId;

	private String userIdFuzzy;

	/**
     * @Description(描述):发布时间
	 */
	private LocalDateTime createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
     * @Description(描述):主体作者ID
	 */
	private String authorUserId;

	private String authorUserIdFuzzy;

	public void setObjectIdFuzzy(String objectIdFuzzy) {
		this.objectIdFuzzy = objectIdFuzzy;
	}

	public String getObjectIdFuzzy() {
		return this.objectIdFuzzy;
	}

	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}

	public String getUserIdFuzzy() {
		return this.userIdFuzzy;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setAuthorUserIdFuzzy(String authorUserIdFuzzy) {
		this.authorUserIdFuzzy = authorUserIdFuzzy;
	}

	public String getAuthorUserIdFuzzy() {
		return this.authorUserIdFuzzy;
	}

	public void setOpId(Integer opId) {
		this.opId = opId;
	}

	public Integer getOpId() {
		return this.opId;
	}

	public void setOpType(Integer opType) {
		this.opType = opType;
	}

	public Integer getOpType() {
		return this.opType;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setAuthorUserId(String authorUserId) {
		this.authorUserId = authorUserId;
	}

	public String getAuthorUserId() {
		return this.authorUserId;
	}


}