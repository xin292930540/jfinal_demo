package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMallGoods<M extends BaseMallGoods<M>> extends Model<M> implements IBean {

	public M setID(java.lang.Long ID) {
		set("ID", ID);
		return (M)this;
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	public M setGoodsId(java.lang.String goodsId) {
		set("GOODS_ID", goodsId);
		return (M)this;
	}
	
	public java.lang.String getGoodsId() {
		return getStr("GOODS_ID");
	}

	public M setGoodsTitle(java.lang.String goodsTitle) {
		set("GOODS_TITLE", goodsTitle);
		return (M)this;
	}
	
	public java.lang.String getGoodsTitle() {
		return getStr("GOODS_TITLE");
	}

	public M setGoodsClass(java.lang.String goodsClass) {
		set("GOODS_CLASS", goodsClass);
		return (M)this;
	}
	
	public java.lang.String getGoodsClass() {
		return getStr("GOODS_CLASS");
	}

	public M setPromotionPrice(java.lang.String promotionPrice) {
		set("PROMOTION_PRICE", promotionPrice);
		return (M)this;
	}
	
	public java.lang.String getPromotionPrice() {
		return getStr("PROMOTION_PRICE");
	}

	public M setGoodsPrice(java.lang.String goodsPrice) {
		set("GOODS_PRICE", goodsPrice);
		return (M)this;
	}
	
	public java.lang.String getGoodsPrice() {
		return getStr("GOODS_PRICE");
	}

	public M setGoodsImages(java.lang.String goodsImages) {
		set("GOODS_IMAGES", goodsImages);
		return (M)this;
	}
	
	public java.lang.String getGoodsImages() {
		return getStr("GOODS_IMAGES");
	}

	public M setAppsPrice(java.lang.String appsPrice) {
		set("APPS_PRICE", appsPrice);
		return (M)this;
	}
	
	public java.lang.String getAppsPrice() {
		return getStr("APPS_PRICE");
	}

	public M setGoodsDesc(byte[] goodsDesc) {
		set("GOODS_DESC", goodsDesc);
		return (M)this;
	}
	
	public byte[] getGoodsDesc() {
		return get("GOODS_DESC");
	}

	public M setAppsDes(byte[] appsDes) {
		set("APPS_DES", appsDes);
		return (M)this;
	}
	
	public byte[] getAppsDes() {
		return get("APPS_DES");
	}

	public M setLogisticsWeigth(java.lang.Integer logisticsWeigth) {
		set("LOGISTICS_WEIGTH", logisticsWeigth);
		return (M)this;
	}
	
	public java.lang.Integer getLogisticsWeigth() {
		return getInt("LOGISTICS_WEIGTH");
	}

	public M setGoodsLocation(java.lang.String goodsLocation) {
		set("GOODS_LOCATION", goodsLocation);
		return (M)this;
	}
	
	public java.lang.String getGoodsLocation() {
		return getStr("GOODS_LOCATION");
	}

	public M setGoodsBarcode(java.lang.String goodsBarcode) {
		set("GOODS_BARCODE", goodsBarcode);
		return (M)this;
	}
	
	public java.lang.String getGoodsBarcode() {
		return getStr("GOODS_BARCODE");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("CREATE_TIME", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("CREATE_TIME");
	}

	public M setIsPutaway(java.lang.String isPutaway) {
		set("IS_PUTAWAY", isPutaway);
		return (M)this;
	}
	
	public java.lang.String getIsPutaway() {
		return getStr("IS_PUTAWAY");
	}

}
