package com.pei.mail.search.feign;

import com.pei.common.es.SkuEsModel;
import com.pei.common.exception.BizCodeEnum;
import com.pei.common.utils.R;
import com.pei.mail.search.service.ProductSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Slf4j
@RequestMapping(value = "/searh/save")
@RestController
public class ProductFeignService {

}
