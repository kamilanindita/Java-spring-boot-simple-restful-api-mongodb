package com.restfulApi.mongo.controller;

import com.restfulApi.mongo.model.Buku;
import com.restfulApi.mongo.repositories.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.bson.types.ObjectId;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/buku")
public class BukuController {
    @Autowired
    private BukuRepository repository;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Buku> getAllBuku() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Buku getBukuById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Buku createBuku(@Valid @RequestBody Buku buku) {
        buku.set_id(ObjectId.get());
        repository.save(buku);
        return buku;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyBukuById(@PathVariable("id") ObjectId id, @Valid @RequestBody Buku buku) {
        buku.set_id(id);
        repository.save(buku);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBuku(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }

}
