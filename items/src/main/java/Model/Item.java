package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Item {
    private int itemId;
    private String itemName;
    private String itemDescription;
}
