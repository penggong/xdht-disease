package com.xdht.disease.sys.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "record_equipment_layout")
public class RecordEquipmentLayout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编号
     */
    @Column(name = "equipment_layout_no")
    private String equipmentLayoutNo;

    /**
     * 核实情况
     */
    @Column(name = "verification_result")
    private String verificationResult;

    /**
     * 状态（0正常 1删除）
     */
    private String status;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新人
     */
    @Column(name = "upadte_by")
    private Long upadteBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取编号
     *
     * @return equipment_layout_no - 编号
     */
    public String getEquipmentLayoutNo() {
        return equipmentLayoutNo;
    }

    /**
     * 设置编号
     *
     * @param equipmentLayoutNo 编号
     */
    public void setEquipmentLayoutNo(String equipmentLayoutNo) {
        this.equipmentLayoutNo = equipmentLayoutNo;
    }

    /**
     * 获取核实情况
     *
     * @return verification_result - 核实情况
     */
    public String getVerificationResult() {
        return verificationResult;
    }

    /**
     * 设置核实情况
     *
     * @param verificationResult 核实情况
     */
    public void setVerificationResult(String verificationResult) {
        this.verificationResult = verificationResult;
    }

    /**
     * 获取状态（0正常 1删除）
     *
     * @return status - 状态（0正常 1删除）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态（0正常 1删除）
     *
     * @param status 状态（0正常 1删除）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新人
     *
     * @return upadte_by - 更新人
     */
    public Long getUpadteBy() {
        return upadteBy;
    }

    /**
     * 设置更新人
     *
     * @param upadteBy 更新人
     */
    public void setUpadteBy(Long upadteBy) {
        this.upadteBy = upadteBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}