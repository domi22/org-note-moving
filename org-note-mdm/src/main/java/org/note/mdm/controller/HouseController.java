package org.note.mdm.controller;

import org.note.mdm.exception.BizException;
import org.note.mdm.module.House;
import org.note.user.ResultCode;
import org.note.user.ResultInfo;
import org.note.user.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {

    @GetMapping("list")
    public ResultInfo<House> getHouse(@RequestParam("name") String name) {
        if (name.equals("1")) {
            throw new NullPointerException("wwwwww");
        }
        if (name.equals("2")) {
            throw new RuntimeException("rrrrr");
        }
        if (name.equals("3")) {
            throw new BizException(ResultCode.CONNECT_TIMEOUT);
        }
        return ResultUtil.success("ok");
    }




}
