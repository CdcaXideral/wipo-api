package com.ppm.wipo.wipoapi.controller;

import com.ppm.wipo.wipoapi.dto.WipoDTO;
import com.ppm.wipo.wipoapi.service.WipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<WipoDTO> searchPatent(HttpServletRequest request) throws IOException {
        String queryParams = request.getQueryString();
        return new ResponseEntity<>(wipoService.searchPatent(queryParams), HttpStatus.OK);
    }

}
