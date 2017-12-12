/* 中电科嘉兴院 */
package com.cetccity.autocode.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * 大屏专题 TBL_SCREEN
 * @author jiangxp
 *
 * @mbg.generated 2017/12/07 13:55
 */
public class Screen implements Serializable {
    private Long id;

    // 英文名
    private String ename;

    // 中文名
    private String cname;

    private String description;

    // 是否可用  0-不可用,1-可用
    private String isUsed;

    // 左屏页面ID
    private String left;

    // 中间屏页面ID
    private String middle;

    // 右屏页面ID
    private String right;

    private String creator;

    private String modifier;

    private Date createDate;

    private Date modifyDate;

    private String deletedFlag;

    private Long reorder;

    //串行版本ID
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 TBL_SCREEN.ID
     * @return TBL_SCREEN.ID
     */
    public Long getId() {
        return id;
    }

    /** 
     * 设置 TBL_SCREEN.ID
     * @param id TBL_SCREEN.ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * 获取 英文名 TBL_SCREEN.ENAME
     * @return 英文名
     */
    public String getEname() {
        return ename;
    }

    /** 
     * 设置 英文名 TBL_SCREEN.ENAME
     * @param ename 英文名
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /** 
     * 获取 中文名 TBL_SCREEN.CNAME
     * @return 中文名
     */
    public String getCname() {
        return cname;
    }

    /** 
     * 设置 中文名 TBL_SCREEN.CNAME
     * @param cname 中文名
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /** 
     * 获取 TBL_SCREEN.DESCRIPTION
     * @return TBL_SCREEN.DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 TBL_SCREEN.DESCRIPTION
     * @param description TBL_SCREEN.DESCRIPTION
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 是否可用  0-不可用,1-可用 TBL_SCREEN.IS_USED
     * @return 是否可用  0-不可用,1-可用
     */
    public String getIsUsed() {
        return isUsed;
    }

    /** 
     * 设置 是否可用  0-不可用,1-可用 TBL_SCREEN.IS_USED
     * @param isUsed 是否可用  0-不可用,1-可用
     */
    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    /** 
     * 获取 左屏页面ID TBL_SCREEN.LEFT
     * @return 左屏页面ID
     */
    public String getLeft() {
        return left;
    }

    /** 
     * 设置 左屏页面ID TBL_SCREEN.LEFT
     * @param left 左屏页面ID
     */
    public void setLeft(String left) {
        this.left = left == null ? null : left.trim();
    }

    /** 
     * 获取 中间屏页面ID TBL_SCREEN.MIDDLE
     * @return 中间屏页面ID
     */
    public String getMiddle() {
        return middle;
    }

    /** 
     * 设置 中间屏页面ID TBL_SCREEN.MIDDLE
     * @param middle 中间屏页面ID
     */
    public void setMiddle(String middle) {
        this.middle = middle == null ? null : middle.trim();
    }

    /** 
     * 获取 右屏页面ID TBL_SCREEN.RIGHT
     * @return 右屏页面ID
     */
    public String getRight() {
        return right;
    }

    /** 
     * 设置 右屏页面ID TBL_SCREEN.RIGHT
     * @param right 右屏页面ID
     */
    public void setRight(String right) {
        this.right = right == null ? null : right.trim();
    }

    /** 
     * 获取 TBL_SCREEN.CREATOR
     * @return TBL_SCREEN.CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /** 
     * 设置 TBL_SCREEN.CREATOR
     * @param creator TBL_SCREEN.CREATOR
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /** 
     * 获取 TBL_SCREEN.MODIFIER
     * @return TBL_SCREEN.MODIFIER
     */
    public String getModifier() {
        return modifier;
    }

    /** 
     * 设置 TBL_SCREEN.MODIFIER
     * @param modifier TBL_SCREEN.MODIFIER
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /** 
     * 获取 TBL_SCREEN.CREATE_DATE
     * @return TBL_SCREEN.CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /** 
     * 设置 TBL_SCREEN.CREATE_DATE
     * @param createDate TBL_SCREEN.CREATE_DATE
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /** 
     * 获取 TBL_SCREEN.MODIFY_DATE
     * @return TBL_SCREEN.MODIFY_DATE
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /** 
     * 设置 TBL_SCREEN.MODIFY_DATE
     * @param modifyDate TBL_SCREEN.MODIFY_DATE
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /** 
     * 获取 TBL_SCREEN.DELETED_FLAG
     * @return TBL_SCREEN.DELETED_FLAG
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /** 
     * 设置 TBL_SCREEN.DELETED_FLAG
     * @param deletedFlag TBL_SCREEN.DELETED_FLAG
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /** 
     * 获取 TBL_SCREEN.REORDER
     * @return TBL_SCREEN.REORDER
     */
    public Long getReorder() {
        return reorder;
    }

    /** 
     * 设置 TBL_SCREEN.REORDER
     * @param reorder TBL_SCREEN.REORDER
     */
    public void setReorder(Long reorder) {
        this.reorder = reorder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ename=").append(ename);
        sb.append(", cname=").append(cname);
        sb.append(", description=").append(description);
        sb.append(", isUsed=").append(isUsed);
        sb.append(", left=").append(left);
        sb.append(", middle=").append(middle);
        sb.append(", right=").append(right);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append(", reorder=").append(reorder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}