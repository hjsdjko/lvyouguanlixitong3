package com.entity.model;

import com.entity.LuxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅游路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LuxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 旅游路线名称
     */
    private String luxianName;


    /**
     * 旅游路线编号
     */
    private String luxianUuidNumber;


    /**
     * 旅游路线照片
     */
    private String luxianPhoto;


    /**
     * 旅游出发地
     */
    private String luxianChufa;


    /**
     * 旅游途径地
     */
    private String luxianTujing;


    /**
     * 旅游目的地
     */
    private String luxianMudi;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 旅游路线介绍
     */
    private String luxianContent;


    /**
     * 逻辑删除
     */
    private Integer luxianDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：旅游路线名称
	 */
    public String getLuxianName() {
        return luxianName;
    }


    /**
	 * 设置：旅游路线名称
	 */
    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 获取：旅游路线编号
	 */
    public String getLuxianUuidNumber() {
        return luxianUuidNumber;
    }


    /**
	 * 设置：旅游路线编号
	 */
    public void setLuxianUuidNumber(String luxianUuidNumber) {
        this.luxianUuidNumber = luxianUuidNumber;
    }
    /**
	 * 获取：旅游路线照片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }


    /**
	 * 设置：旅游路线照片
	 */
    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 获取：旅游出发地
	 */
    public String getLuxianChufa() {
        return luxianChufa;
    }


    /**
	 * 设置：旅游出发地
	 */
    public void setLuxianChufa(String luxianChufa) {
        this.luxianChufa = luxianChufa;
    }
    /**
	 * 获取：旅游途径地
	 */
    public String getLuxianTujing() {
        return luxianTujing;
    }


    /**
	 * 设置：旅游途径地
	 */
    public void setLuxianTujing(String luxianTujing) {
        this.luxianTujing = luxianTujing;
    }
    /**
	 * 获取：旅游目的地
	 */
    public String getLuxianMudi() {
        return luxianMudi;
    }


    /**
	 * 设置：旅游目的地
	 */
    public void setLuxianMudi(String luxianMudi) {
        this.luxianMudi = luxianMudi;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：旅游路线介绍
	 */
    public String getLuxianContent() {
        return luxianContent;
    }


    /**
	 * 设置：旅游路线介绍
	 */
    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getLuxianDelete() {
        return luxianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setLuxianDelete(Integer luxianDelete) {
        this.luxianDelete = luxianDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
