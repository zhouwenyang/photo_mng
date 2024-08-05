package com.example.photomanagement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoController {

    private final Map<String, Photo> photoRepos=new HashMap<String,Photo>() {
        {
            
        }


    
     
    };

    //返回所有图片
    @GetMapping("/photos")
    public Collection<Photo> photos() {
        return photoRepos.values();
    }

    //返回指定id的图片
    @GetMapping("/photos/{id}")
    public Photo photo(@PathVariable String id) {
        return photoRepos.get(id);
    }

    //删除指定id的图片
    @DeleteMapping("/photos/{id}")
    public void deletePhoto(@PathVariable String id) {
        photoRepos.remove(id);
    }





    





    
}
