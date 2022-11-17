package kodlama.io.trendyol.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private int id;

    @Column(name = "categoryName")
    private String name;

    @ManyToOne
    @JoinColumn(name = "main_category_id")
    private MainCategory mainCategory;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
