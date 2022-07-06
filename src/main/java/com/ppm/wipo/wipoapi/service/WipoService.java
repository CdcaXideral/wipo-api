package com.ppm.wipo.wipoapi.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class WipoService {

    public Object searchPatent(String queryParams) throws IOException {
        // Hardcode test
        // String docId = "WO2022132382";
        // String cId = "P22-L59U72-97854-1";

        String url = "https://patentscope.wipo.int/search/en/detail.jsf?" + queryParams;
        Document doc = Jsoup.connect(url).get();
        Elements allElements = doc.getAllElements();

        return null;
    }


}
