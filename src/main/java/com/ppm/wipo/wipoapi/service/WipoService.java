package com.ppm.wipo.wipoapi.service;

import com.ppm.wipo.wipoapi.dto.WipoDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class WipoService {

    public WipoDTO searchPatent(String queryParams) throws IOException {
        String url = "https://patentscope.wipo.int/search/en/detail.jsf?" + queryParams;
        Document doc = Jsoup.connect(url).get();

        // Create wipo
        WipoDTO wipoDTO = new WipoDTO();
        getPatentInfo(wipoDTO, doc);

        return wipoDTO;
    }

    public void getPatentInfo(WipoDTO wipoDTO, Document doc) {
        // PctTitle
        String pctTitle = doc
                .getElementsByClass("PCTtitle").first()
                .getElementsByClass("needTranslation-biblio").first()
                .text();
        wipoDTO.setPctTitle(pctTitle);

        // PatentAbstract
        String patentAbstract = doc
                .getElementsByClass("patent-abstract").first()
                .getElementsByClass("needTranslation-biblio").first()
                .text();
        wipoDTO.setPatentAbstract(patentAbstract);

        // Get dataCard
        Element dataCard = doc
                .getElementsByClass("ps-biblio-data--biblio-card").first();

        // PublicationNumber
        String publicationNumber = dataCard
                .child(0)
                .child(1)
                .child(0)
                .text();
        wipoDTO.setPublicationNumber(publicationNumber);

        // PublicationDate
        String publicationDate = dataCard
                .child(1)
                .child(1)
                .text();
        wipoDTO.setPublicationDate(publicationDate);

        // InternationalApplicationNo
        String internationalApplicationNo = dataCard
                .child(2)
                .child(1)
                .text();
        wipoDTO.setInternationalApplicationNo(internationalApplicationNo);

        // Inventor
        String inventor = dataCard
                .child(7)
                .child(1)
                .child(0)
                .child(0)
                .child(0)
                .text();
        wipoDTO.setInventor(inventor);

        // TODO: Inventors array
        // Remove one child and get children to get list
    }


}
