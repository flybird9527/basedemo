/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.basedemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

/**
 * PluginConfigManageController
 */
@RestController
@RequestMapping("/data-out/ztytest")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);


    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");


    @PostMapping("/testtb1")
    public String list(@RequestParam(name = "id", required = false) String id,
                           @RequestParam(name = "test", required = false) String test,
                           @RequestBody Object body) {
        System.out.println(body.toString());
        return "success";
    }

    @PostMapping("/testtb2")
    public String list(@RequestParam(name = "appKey", required = false) String appKey,
                           @RequestParam(name = "appSecret", required = false) String appSecret) {
        System.out.println(appKey+appSecret);
        return "success";
    }

}
