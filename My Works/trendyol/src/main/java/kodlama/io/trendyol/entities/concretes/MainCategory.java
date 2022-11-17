package kodlama.io.trendyol.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "main_categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MainCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "main_category_name")
    private String name;

    @OneToMany(mappedBy = "mainCategory")
    private List<Category> categories;
}
