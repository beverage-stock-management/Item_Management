package Controller;

import Model.Item;
import com.beverageStock.items.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    @Autowired
    private ItemsRepository itemsRepository;

    @GetMapping("/getAllItems")
    public List<Item> getAllItems(){
        return itemsRepository.findAll();
    }

    @GetMapping(value = "/getItemsbyId/{itemId}") //read single file
    public Object getItemsbyId(@PathVariable Integer itemId){
        return itemsRepository.findById(itemId);
    }

    @PostMapping(value = "/addItems") //create
    public Item addItems(@RequestBody Item item){
        return itemsRepository.save(item);
    }

    @DeleteMapping(value = "/deleteItems/{itemId}") //delete
    public void deleteItems(@PathVariable Integer itemId){
        itemsRepository.deleteById(itemId);
    }

    @PutMapping(value = "/updateItems/{itemId}") //update
    public Item updateItems(@PathVariable Integer itemId,@RequestBody Item item){

        return itemsRepository.save(item);
    }

}
