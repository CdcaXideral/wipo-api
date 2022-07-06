package com.ppm.wipo.wipoapi.controller;

import com.ppm.wipo.wipoapi.service.WipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/patents")
public class WipoController {

    @Autowired
    private WipoService wipoService;

    @GetMapping()
    public void searchPatent(HttpServletRequest request) throws IOException {
        String queryParams = request.getQueryString();
        wipoService.searchPatent(queryParams);
    }

}
