package com.program.demomongo.resource;

import com.program.demomongo.model.info;
import com.program.demomongo.repository.infoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class infoController {
    @Autowired
    private infoRepository repository;

    @PostMapping("/info")
    public String setdata(@Validated @RequestBody info inf)

    {
        repository.save(inf);
        return "Added data with Id:"+inf.getId();
    }
    @GetMapping("/info")
    public List<info> getdata(){return  repository.findAll();}

    @GetMapping("/info/{id}")
    public Optional<info> getdata(@PathVariable int id){return repository.findById(id);}

    @PutMapping("/info/{id}")
    public Object updatedata(@RequestBody info inf,@PathVariable Integer id)
    {

        Optional<info> value=repository.findById(id);
        repository.save(inf);
        return "Updated data with Id:"+id;
    }
    @DeleteMapping("/info/{id}")
    public String deletedata(@PathVariable int id){
        repository.deleteById(id);
        return "Deleted data with Id:"+id;
    }
}
