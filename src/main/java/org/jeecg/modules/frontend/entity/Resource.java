package org.jeecg.modules.frontend.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 资源文件
 * @author： jeecg-boot
 * @date：   2019-04-21
 * @version： V1.0
 */
@Data
@TableName("resource")
public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;
    
	/**resourceId*/
	@TableId(type = IdType.UUID)
	@Excel(name = "resourceId", width = 15)
	private java.lang.String resourceId;
	/**type*/
	@Excel(name = "type", width = 15)
	private java.lang.String type;
	/**url*/
	@Excel(name = "url", width = 15)
	private java.lang.String url;
	/**creatTime*/
	@Excel(name = "creatTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date creatTime;
	/**createBy*/
	@Excel(name = "createBy", width = 15)
	private java.lang.String createBy;

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}
