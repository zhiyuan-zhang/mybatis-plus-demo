/**  
* <p>Title: ResultBean.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* <p>Company: zhongwangkeji</p>  
* @author zhanghaow
* @date 2018年9月5日  
* @version 1.0  
*/  
package com.hki.mpdemo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhanghaow
 *<p>Title: ResultBean</p> 
 *
 *<p>Description: </p> 
 *
 * 2018年9月5日 上午11:08:31
 */
@Data
public class ResultBean<T> implements Serializable {
	//参数有问题
	public static final int CHECK_FAIL = 4;

	private static final long serialVersionUID = 1L;
	//服务端导致的问题
	public static final int SERVER_FAIL = 1;
	// 权限问题
	public static final int NO_PERMISSION = 2;
	// 没有登陆
	public static final int NO_LOGIN = -1;
	//未知异常报错
	public static final int UNKNOWN_EXCEPTION = -99;
	//token 异常
	public static final int TOKEN_ERROR = 3;

	public static final int SUCCESS = 0;

	/**
	 * 返回的信息(主要出错的时候使用)
	 */
	private String msg = "success";

	/**
	 * 接口返回码, 0表示成功, 其他看对应的定义
	 * 推荐的做法是: 
	 * 0   : 成功
	 * >0 : 表示已知的异常(例如提示错误等, 需要调用地方单独处理) 
	 * <0 : 表示未知的异常(不需要单独处理, 调用方统一处理)
	 * (PS:错误返回一般有两种办法一种是类似这样的一种是根据状态码返回范围来做判断 )
	 */
	private int code = SUCCESS;

	/**
	 * 返回的数据
	 */
	private T data;

	public ResultBean() {
		super();
	}

	public ResultBean(T data) {
		super();
		this.data = data;
	}

	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = UNKNOWN_EXCEPTION;
	}
	
	
}
