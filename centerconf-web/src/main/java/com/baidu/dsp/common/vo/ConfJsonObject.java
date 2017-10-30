package com.baidu.dsp.common.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.baidu.ub.common.commons.ThreadContext;

/**
 * JSON 基类
 *
 * @author chenmeiyang
 * @version 2013-12-3
 */
public class ConfJsonObject implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8441731449894560959L;

    /**
     * 如果成功的话，数据结果
     */
    protected Map<String, Object> result = new HashMap<String, Object>();
    
    public ConfJsonObject() {
        sessionId = ThreadContext.getSessionId();
    }

    /**
     * 会话ID
     */
    private String sessionId = "";

    protected String success = "true";

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getSessionId() {
        return sessionId;
    }

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	@Override
    public String toString() {
        return "JsonObjectBase [result=" + result + ", sessionId=" + sessionId + ", success=" + success + "]";
    }

}
