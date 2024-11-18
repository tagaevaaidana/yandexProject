package peaksoft.ozonproject.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class YandexResponse {
    private Long id;
    private String ProductName;
    private int price;
    private int totalPrice;
    private String img_url;
    private String product_url;
}
