package kodlama.io.trendyol.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private int id;

    @Column(name = "productName")
    private String name;

    @Column(name = "productDescreption")
    private String descreption;

    @Column(name = "productPrice")
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
