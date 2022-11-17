package kodlama.io.trendyol.business.requests.productRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    private String name;
    private String productDescreption;
    private double productPrice;
    private int categoryId;
}
