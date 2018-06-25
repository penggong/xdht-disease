package com.xdht.disease.test.controller;

import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.common.core.Result;
import com.xdht.disease.test.model.SysTestGpj;
import com.xdht.disease.test.service.SysTestGpjService;
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
@RequestMapping(value = "/api/v1/sysTestG")
public class TestGpjController {

    @Autowired
    private SysTestGpjService sysTestGpjService;

    @RequestMapping(value = "/recordList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "查询列表")
    public  ResponseEntity<Result<List<SysTestGpj>>> recordList(@RequestBody SysTestGpj sysTestGpj) {
        return new ResponseEntity<>(Result.ok(sysTestGpjService.queryList(sysTestGpj)), HttpStatus.OK);
    }
    @RequestMapping(value = "/recordPage", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "分页查询")
    public ResponseEntity<Result<PageResult<SysTestGpj>>> recordPage(@RequestBody SysTestGpj sysTestGpj, @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return new ResponseEntity<>(Result.ok(sysTestGpjService.queryListPage(sysTestGpj,pageNum,pageSize)), HttpStatus.OK);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "删除测试")
    public ResponseEntity<Result<SysTestGpj>> delete(@RequestParam Long id) {
        return new ResponseEntity<>(Result.ok(sysTestGpjService.delete(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "增加测试")
    public ResponseEntity<Result<SysTestGpj>> add(@RequestBody SysTestGpj sysTestGpj) {
        return new ResponseEntity<>(Result.ok(sysTestGpjService.add(sysTestGpj)), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改测试")
    public ResponseEntity<Result<SysTestGpj>> update(@RequestBody SysTestGpj sysTestGpj) {
        return new ResponseEntity<>(Result.ok(sysTestGpjService.update(sysTestGpj)), HttpStatus.OK);
    }



}
