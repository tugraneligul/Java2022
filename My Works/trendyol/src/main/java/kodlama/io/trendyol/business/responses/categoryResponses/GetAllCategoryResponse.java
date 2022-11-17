package kodlama.io.trendyol.business.responses.categoryResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCategoryResponse {

    private String name;
    private String mainCategoryName;
}
