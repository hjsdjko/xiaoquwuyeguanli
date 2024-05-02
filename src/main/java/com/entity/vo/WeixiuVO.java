package com.entity.vo;

import com.entity.WeixiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 维修信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("weixiu")
public class WeixiuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 维修标题
     */

    @TableField(value = "weixiu_name")
    private String weixiuName;


    /**
     * 维修内容
     */

    @TableField(value = "weixiu_content")
    private String weixiuContent;


    /**
     * 是否处理
     */

    @TableField(value = "shifouchuli_types")
    private Integer shifouchuliTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：维修标题
	 */
    public String getWeixiuName() {
        return weixiuName;
    }


    /**
	 * 获取：维修标题
	 */

    public void setWeixiuName(String weixiuName) {
        this.weixiuName = weixiuName;
    }
    /**
	 * 设置：维修内容
	 */
    public String getWeixiuContent() {
        return weixiuContent;
    }


    /**
	 * 获取：维修内容
	 */

    public void setWeixiuContent(String weixiuContent) {
        this.weixiuContent = weixiuContent;
    }
    /**
	 * 设置：是否处理
	 */
    public Integer getShifouchuliTypes() {
        return shifouchuliTypes;
    }


    /**
	 * 获取：是否处理
	 */

    public void setShifouchuliTypes(Integer shifouchuliTypes) {
        this.shifouchuliTypes = shifouchuliTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}