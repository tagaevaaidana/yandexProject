package peaksoft.ozonproject.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import peaksoft.ozonproject.mapper.YandexMapper;
import peaksoft.ozonproject.repository.YandexRepository;

import java.io.IOException;

@Service
public class YandexService {

    private  final YandexRepository yandexRepository;
    private final YandexMapper yandexMapper;

    public YandexService(YandexRepository yandexRepository, YandexMapper yandexMapper) {
        this.yandexRepository = yandexRepository;
        this.yandexMapper = yandexMapper;
    }


    public void parseProducts() throws IOException {
        try {
            Document doc = Jsoup.connect("https://market.yandex.ru/")
                    .timeout(10000)
                    .get();
            System.out.println("doc");
//            System.out.println(doc);
            Elements price = doc.getElementsByClass("ds-text ds-text_weight_bold ds-text_color_price-term ds-text_typography_headline-5 ds-text_headline-5_tight ds-text_headline-5_bold");
            System.out.println("PRICE: " + price);
            System.out.println("after doc");

            Elements productName = doc.getElementsByClass("ds-text ds-text_lineClamp_2 ds-text_weight_med ds-text_color_text-primary ds-text_typography_text ds-text_text_normal ds-text_text_med ds-text_lineClamp");
            System.out.println("productName: " + productName);
            System.out.println("after doc");

            Elements totalPrice = doc.getElementsByClass("ds-text ds-text_weight_bold ds-text_color_price-term ds-text_typography_headline-5 ds-text_headline-5_tight ds-text_headline-5_bold");
            System.out.println("totalPrice: " + totalPrice);
            System.out.println("after doc");

            Elements imgUrl = doc.getElementsByClass("iqmYz");
            System.out.println("imgUrl: " + imgUrl);
            System.out.println("after doc");


        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


}
