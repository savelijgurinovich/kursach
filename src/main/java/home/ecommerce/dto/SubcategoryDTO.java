package home.ecommerce.dto;

import home.ecommerce.entity.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SubcategoryDTO {
    private String subcategoryName;
    private String cipher;
    private MultipartFile file;
    private Category category;
}
