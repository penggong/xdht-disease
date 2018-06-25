package com.xdht.disease.test.service;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.test.model.SysTestGpj;
import com.xdht.disease.common.core.Service;

import java.util.List;


/**
 * Created by gpj on 2018/06/25.
 */
public interface SysTestGpjService extends Service<SysTestGpj> {

    /**
     * 查询
     * @param recordProductRequest 查询条件
     * @return 返回结果
     */
    public List<SysTestGpj> queryList(SysTestGpj sysTestGpj);

    /**
     * 分页查询
     * @param recordProductRequest 查询条件
     * @param pageNum  页数
     * @param pageSize  每页大小
     * @return 返回结果
     */
    public PageResult<SysTestGpj> queryListPage(SysTestGpj sysTestGpj, Integer pageNum, Integer pageSize);

    /**
     * 添加
     * @param SysTestGpj 实体
     * @return 返回结果
     */
    public  SysTestGpj add(SysTestGpj sysTestGpj);

    /**
     * 删除
     * @param id 主键id
     * @return 返回结果
     */
    public  SysTestGpj delete(Long id);

    /**
     * 修改
     * @param SysTestGpj 实体
     * @return 返回结果
     */
    public  SysTestGpj update(SysTestGpj sysTestGpj);
}
