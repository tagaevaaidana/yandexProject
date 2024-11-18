package peaksoft.ozonproject.mapper;

import org.springframework.stereotype.Component;
import peaksoft.ozonproject.dto.YandexResponse;
import peaksoft.ozonproject.model.YandexProducts;

@Component
public class YandexMapper {

    public YandexResponse mapToYandexResponse(YandexProducts yandexProducts) {
        return new YandexResponse()
                .setId(yandexProducts.getId())
                .setProductName(yandexProducts.getProductName())
                .setPrice(yandexProducts.getPrice())
                .setTotalPrice(yandexProducts.getTotalPrice())
                .setImg_url(yandexProducts.getImgUrl())
                .setProduct_url(yandexProducts.getProductUrl());

    }
}
