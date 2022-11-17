package kodlama.io.trendyol.business.requests.categoryRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {
    private String name;
    private int mainCategoryId;
}
