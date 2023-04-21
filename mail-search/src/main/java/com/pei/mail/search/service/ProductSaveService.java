package com.pei.mail.search.service;

import com.pei.common.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

public interface ProductSaveService {
    public boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
