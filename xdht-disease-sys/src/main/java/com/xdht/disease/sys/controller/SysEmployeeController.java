package com.xdht.disease.sys.controller;

import com.xdht.disease.common.authorization.annotation.CurrentUser;
import com.xdht.disease.common.core.Result;
import com.xdht.disease.common.model.User;
import com.xdht.disease.sys.model.SysEmployee;
import com.xdht.disease.sys.service.SysEmployeeService;
import com.xdht.disease.sys.vo.request.SysEmployeeRequest;
import com.xdht.disease.sys.vo.response.SysEmployeeResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by L on 2018/5/30.
 */
@Log4j
@RestController
@RequestMapping(value = "/api/v1/sysEmployee")
public class SysEmployeeController {

    @Autowired
    private SysEmployeeService sysEmployeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "查询员工列表分页")
//    @Authorization
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "authorization", value = "authorization", required = true, dataType = "string", paramType = "header"),
//    })
    public ResponseEntity<Result<List<SysEmployee>>> createToken(@CurrentUser User user, @RequestBody SysEmployeeRequest sysEmployeeRequest) {
        return new ResponseEntity<>(Result.ok(sysEmployeeService.querySysEmpListPage(sysEmployeeRequest)), HttpStatus.OK);

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "添加员工")
    public ResponseEntity<Result<SysEmployeeResponse>> addEmployee(@CurrentUser User user, @RequestBody SysEmployee sysEmployee) {
        return new ResponseEntity<>(Result.ok(sysEmployeeService.addEmployee(sysEmployee)), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "删除员工")
    public ResponseEntity<Result<SysEmployeeResponse>> deleteEmployee(@CurrentUser User user, @RequestParam Long id) {
        return new ResponseEntity<>(Result.ok(sysEmployeeService.deleteEmployee(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改员工")
    public ResponseEntity<Result<SysEmployeeResponse>> updateEmployee(@CurrentUser User user, @RequestBody SysEmployee sysEmployee) {
        return new ResponseEntity<>(Result.ok(sysEmployeeService.updateEmployee(sysEmployee)), HttpStatus.OK);
    }



}
