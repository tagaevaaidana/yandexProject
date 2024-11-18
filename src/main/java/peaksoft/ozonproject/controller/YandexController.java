package peaksoft.ozonproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.ozonproject.service.YandexService;

@RestController
@RequestMapping("/api/products")
public class YandexController {

    private final YandexService yandexService;


    public YandexController(YandexService yandexService) {
        this.yandexService = yandexService;
    }


}
