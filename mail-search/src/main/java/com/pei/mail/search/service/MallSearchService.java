package com.pei.mail.search.service;

import com.pei.mail.search.vo.SearchParam;
import com.pei.mail.search.vo.SearchResult;

public interface MallSearchService {
    SearchResult search(SearchParam param);
}
