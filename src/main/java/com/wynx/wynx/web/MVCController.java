package com.wynx.wynx.web;

import com.wynx.wynx.dao.SongDao;
import com.wynx.wynx.ds.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCController {

    @Autowired
    public SongDao songDao;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("songList",songDao.findAll());
        System.out.println("yes1");
        model.addAttribute("song",new Song());
        System.out.println("yes2");
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Song song, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            System.out.println("yes3");
            return "add-song";
        }
        System.out.println("yes4");
        songDao.save(song);
        return "redirect:/";

    }
}
