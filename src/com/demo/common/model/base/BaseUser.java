package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setUName(java.lang.String uName) {
		set("uName", uName);
		return (M)this;
	}
	
	public java.lang.String getUName() {
		return getStr("uName");
	}

	public M setPwd(java.lang.String pwd) {
		set("pwd", pwd);
		return (M)this;
	}
	
	public java.lang.String getPwd() {
		return getStr("pwd");
	}

	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}
	
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

}
