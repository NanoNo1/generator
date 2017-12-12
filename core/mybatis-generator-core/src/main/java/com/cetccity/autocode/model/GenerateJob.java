/* 中电科嘉兴院 */
package com.cetccity.autocode.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * job表 TBL_GENERATE_JOB
 * @author jiangxp
 *
 * @mbg.generated 2017/12/07 13:26
 */
public class GenerateJob implements Serializable {
    // ID
    private Long id;

    // 是否需要审核
    private String needAudit;

    // job名
    private String jobName;

    // cron表达式
    private String cron;

    // 频率
    private String frequency;

    // 上次更新时间
    private Date lastTime;

    // 下次更新时间
    private Date nextTime;

    // 模板Id
    private Long templateId;

    // JOB状态
    private String jobStatus;

    // 审核人
    private String auditor;

    // 描述
    private String description;

    // 来源类型
    private String sourceType;

    // 来源API
    private String sourceApi;

    // 发送时间
    private String sendTime;

    // 初始化时间
    private String generateTime;

    // 创建者
    private String creator;

    // 修改者
    private String modifier;

    // 创建时间
    private Date createDate;

    // 修改时间
    private Date modifyDate;

    // 是否删除
    private String deletedFlag;

    // 审核人Id
    private Long auditorId;

    // 频率管理Id
    private Long timeManageId;

    private String serviceBeanName;

    private String serviceMethodName;

    // 调用magneto时使用
    private String uuid;

    private Long serviceMethodId;

    private Long serviceBeanId;

    // 服务管理Id
    private Long scheduleTaskId;

    //串行版本ID
    private static final long serialVersionUID = 1L;

    /** 
     * 获取 ID TBL_GENERATE_JOB.ID
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /** 
     * 设置 ID TBL_GENERATE_JOB.ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * 获取 是否需要审核 TBL_GENERATE_JOB.NEED_AUDIT
     * @return 是否需要审核
     */
    public String getNeedAudit() {
        return needAudit;
    }

    /** 
     * 设置 是否需要审核 TBL_GENERATE_JOB.NEED_AUDIT
     * @param needAudit 是否需要审核
     */
    public void setNeedAudit(String needAudit) {
        this.needAudit = needAudit == null ? null : needAudit.trim();
    }

    /** 
     * 获取 job名 TBL_GENERATE_JOB.JOB_NAME
     * @return job名
     */
    public String getJobName() {
        return jobName;
    }

    /** 
     * 设置 job名 TBL_GENERATE_JOB.JOB_NAME
     * @param jobName job名
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /** 
     * 获取 cron表达式 TBL_GENERATE_JOB.CRON
     * @return cron表达式
     */
    public String getCron() {
        return cron;
    }

    /** 
     * 设置 cron表达式 TBL_GENERATE_JOB.CRON
     * @param cron cron表达式
     */
    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    /** 
     * 获取 频率 TBL_GENERATE_JOB.FREQUENCY
     * @return 频率
     */
    public String getFrequency() {
        return frequency;
    }

    /** 
     * 设置 频率 TBL_GENERATE_JOB.FREQUENCY
     * @param frequency 频率
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    /** 
     * 获取 上次更新时间 TBL_GENERATE_JOB.LAST_TIME
     * @return 上次更新时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /** 
     * 设置 上次更新时间 TBL_GENERATE_JOB.LAST_TIME
     * @param lastTime 上次更新时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /** 
     * 获取 下次更新时间 TBL_GENERATE_JOB.NEXT_TIME
     * @return 下次更新时间
     */
    public Date getNextTime() {
        return nextTime;
    }

    /** 
     * 设置 下次更新时间 TBL_GENERATE_JOB.NEXT_TIME
     * @param nextTime 下次更新时间
     */
    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }

    /** 
     * 获取 模板Id TBL_GENERATE_JOB.TEMPLATE_ID
     * @return 模板Id
     */
    public Long getTemplateId() {
        return templateId;
    }

    /** 
     * 设置 模板Id TBL_GENERATE_JOB.TEMPLATE_ID
     * @param templateId 模板Id
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /** 
     * 获取 JOB状态 TBL_GENERATE_JOB.JOB_STATUS
     * @return JOB状态
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /** 
     * 设置 JOB状态 TBL_GENERATE_JOB.JOB_STATUS
     * @param jobStatus JOB状态
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    /** 
     * 获取 审核人 TBL_GENERATE_JOB.AUDITOR
     * @return 审核人
     */
    public String getAuditor() {
        return auditor;
    }

    /** 
     * 设置 审核人 TBL_GENERATE_JOB.AUDITOR
     * @param auditor 审核人
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /** 
     * 获取 描述 TBL_GENERATE_JOB.DESCRIPTION
     * @return 描述
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 描述 TBL_GENERATE_JOB.DESCRIPTION
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 获取 来源类型 TBL_GENERATE_JOB.SOURCE_TYPE
     * @return 来源类型
     */
    public String getSourceType() {
        return sourceType;
    }

    /** 
     * 设置 来源类型 TBL_GENERATE_JOB.SOURCE_TYPE
     * @param sourceType 来源类型
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /** 
     * 获取 来源API TBL_GENERATE_JOB.SOURCE_API
     * @return 来源API
     */
    public String getSourceApi() {
        return sourceApi;
    }

    /** 
     * 设置 来源API TBL_GENERATE_JOB.SOURCE_API
     * @param sourceApi 来源API
     */
    public void setSourceApi(String sourceApi) {
        this.sourceApi = sourceApi == null ? null : sourceApi.trim();
    }

    /** 
     * 获取 发送时间 TBL_GENERATE_JOB.SEND_TIME
     * @return 发送时间
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * 设置 发送时间 TBL_GENERATE_JOB.SEND_TIME
     * @param sendTime 发送时间
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    /** 
     * 获取 初始化时间 TBL_GENERATE_JOB.GENERATE_TIME
     * @return 初始化时间
     */
    public String getGenerateTime() {
        return generateTime;
    }

    /** 
     * 设置 初始化时间 TBL_GENERATE_JOB.GENERATE_TIME
     * @param generateTime 初始化时间
     */
    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime == null ? null : generateTime.trim();
    }

    /** 
     * 获取 创建者 TBL_GENERATE_JOB.CREATOR
     * @return 创建者
     */
    public String getCreator() {
        return creator;
    }

    /** 
     * 设置 创建者 TBL_GENERATE_JOB.CREATOR
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /** 
     * 获取 修改者 TBL_GENERATE_JOB.MODIFIER
     * @return 修改者
     */
    public String getModifier() {
        return modifier;
    }

    /** 
     * 设置 修改者 TBL_GENERATE_JOB.MODIFIER
     * @param modifier 修改者
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /** 
     * 获取 创建时间 TBL_GENERATE_JOB.CREATE_DATE
     * @return 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /** 
     * 设置 创建时间 TBL_GENERATE_JOB.CREATE_DATE
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /** 
     * 获取 修改时间 TBL_GENERATE_JOB.MODIFY_DATE
     * @return 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /** 
     * 设置 修改时间 TBL_GENERATE_JOB.MODIFY_DATE
     * @param modifyDate 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /** 
     * 获取 是否删除 TBL_GENERATE_JOB.DELETED_FLAG
     * @return 是否删除
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /** 
     * 设置 是否删除 TBL_GENERATE_JOB.DELETED_FLAG
     * @param deletedFlag 是否删除
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /** 
     * 获取 审核人Id TBL_GENERATE_JOB.AUDITOR_ID
     * @return 审核人Id
     */
    public Long getAuditorId() {
        return auditorId;
    }

    /** 
     * 设置 审核人Id TBL_GENERATE_JOB.AUDITOR_ID
     * @param auditorId 审核人Id
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /** 
     * 获取 频率管理Id TBL_GENERATE_JOB.TIME_MANAGE_ID
     * @return 频率管理Id
     */
    public Long getTimeManageId() {
        return timeManageId;
    }

    /** 
     * 设置 频率管理Id TBL_GENERATE_JOB.TIME_MANAGE_ID
     * @param timeManageId 频率管理Id
     */
    public void setTimeManageId(Long timeManageId) {
        this.timeManageId = timeManageId;
    }

    /** 
     * 获取 TBL_GENERATE_JOB.SERVICE_BEAN_NAME
     * @return TBL_GENERATE_JOB.SERVICE_BEAN_NAME
     */
    public String getServiceBeanName() {
        return serviceBeanName;
    }

    /** 
     * 设置 TBL_GENERATE_JOB.SERVICE_BEAN_NAME
     * @param serviceBeanName TBL_GENERATE_JOB.SERVICE_BEAN_NAME
     */
    public void setServiceBeanName(String serviceBeanName) {
        this.serviceBeanName = serviceBeanName == null ? null : serviceBeanName.trim();
    }

    /** 
     * 获取 TBL_GENERATE_JOB.SERVICE_METHOD_NAME
     * @return TBL_GENERATE_JOB.SERVICE_METHOD_NAME
     */
    public String getServiceMethodName() {
        return serviceMethodName;
    }

    /** 
     * 设置 TBL_GENERATE_JOB.SERVICE_METHOD_NAME
     * @param serviceMethodName TBL_GENERATE_JOB.SERVICE_METHOD_NAME
     */
    public void setServiceMethodName(String serviceMethodName) {
        this.serviceMethodName = serviceMethodName == null ? null : serviceMethodName.trim();
    }

    /** 
     * 获取 调用magneto时使用 TBL_GENERATE_JOB.UUID
     * @return 调用magneto时使用
     */
    public String getUuid() {
        return uuid;
    }

    /** 
     * 设置 调用magneto时使用 TBL_GENERATE_JOB.UUID
     * @param uuid 调用magneto时使用
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /** 
     * 获取 TBL_GENERATE_JOB.SERVICE_METHOD_ID
     * @return TBL_GENERATE_JOB.SERVICE_METHOD_ID
     */
    public Long getServiceMethodId() {
        return serviceMethodId;
    }

    /** 
     * 设置 TBL_GENERATE_JOB.SERVICE_METHOD_ID
     * @param serviceMethodId TBL_GENERATE_JOB.SERVICE_METHOD_ID
     */
    public void setServiceMethodId(Long serviceMethodId) {
        this.serviceMethodId = serviceMethodId;
    }

    /** 
     * 获取 TBL_GENERATE_JOB.SERVICE_BEAN_ID
     * @return TBL_GENERATE_JOB.SERVICE_BEAN_ID
     */
    public Long getServiceBeanId() {
        return serviceBeanId;
    }

    /** 
     * 设置 TBL_GENERATE_JOB.SERVICE_BEAN_ID
     * @param serviceBeanId TBL_GENERATE_JOB.SERVICE_BEAN_ID
     */
    public void setServiceBeanId(Long serviceBeanId) {
        this.serviceBeanId = serviceBeanId;
    }

    /** 
     * 获取 服务管理Id TBL_GENERATE_JOB.SCHEDULE_TASK_ID
     * @return 服务管理Id
     */
    public Long getScheduleTaskId() {
        return scheduleTaskId;
    }

    /** 
     * 设置 服务管理Id TBL_GENERATE_JOB.SCHEDULE_TASK_ID
     * @param scheduleTaskId 服务管理Id
     */
    public void setScheduleTaskId(Long scheduleTaskId) {
        this.scheduleTaskId = scheduleTaskId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", needAudit=").append(needAudit);
        sb.append(", jobName=").append(jobName);
        sb.append(", cron=").append(cron);
        sb.append(", frequency=").append(frequency);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", nextTime=").append(nextTime);
        sb.append(", templateId=").append(templateId);
        sb.append(", jobStatus=").append(jobStatus);
        sb.append(", auditor=").append(auditor);
        sb.append(", description=").append(description);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", sourceApi=").append(sourceApi);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", generateTime=").append(generateTime);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append(", auditorId=").append(auditorId);
        sb.append(", timeManageId=").append(timeManageId);
        sb.append(", serviceBeanName=").append(serviceBeanName);
        sb.append(", serviceMethodName=").append(serviceMethodName);
        sb.append(", uuid=").append(uuid);
        sb.append(", serviceMethodId=").append(serviceMethodId);
        sb.append(", serviceBeanId=").append(serviceBeanId);
        sb.append(", scheduleTaskId=").append(scheduleTaskId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}