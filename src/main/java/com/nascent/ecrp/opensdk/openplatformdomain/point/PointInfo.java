package com.nascent.ecrp.opensdk.openplatformdomain.point;

import java.math.BigDecimal;

/**
 * 积分信息
 * @author wxg
 *
 */
public class PointInfo {
	/**
	 * 总赚取积分
	 */
	private BigDecimal totalGetPoint;
	/**
	 * 总使用积分
	 */
	private BigDecimal totalUsePoint;
	/**
	 * 总积分
	 */
	private BigDecimal totalPoint;
	/**
	 * 可用积分
	 */
	private BigDecimal availPoint;
	/**
	 * 冻结积分
	 */
	private BigDecimal frozenPoint;

	public BigDecimal getTotalGetPoint() {
		return totalGetPoint;
	}

	public void setTotalGetPoint(BigDecimal totalGetPoint) {
		this.totalGetPoint = totalGetPoint;
	}

	public BigDecimal getTotalUsePoint() {
		return totalUsePoint;
	}

	public void setTotalUsePoint(BigDecimal totalUsePoint) {
		this.totalUsePoint = totalUsePoint;
	}

	public BigDecimal getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(BigDecimal totalPoint) {
		this.totalPoint = totalPoint;
	}

	public BigDecimal getAvailPoint() {
		return availPoint;
	}

	public void setAvailPoint(BigDecimal availPoint) {
		this.availPoint = availPoint;
	}

	public BigDecimal getFrozenPoint() {
		return frozenPoint;
	}

	public void setFrozenPoint(BigDecimal frozenPoint) {
		this.frozenPoint = frozenPoint;
	}
}
