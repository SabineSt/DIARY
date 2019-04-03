/*
package com.seleni.Diary.presentation;

import com.seleni.Diary.logic.Entry;
import com.seleni.Diary.logic.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class  HomeController {

    @Autowired
    private EntryService entriesService;


    @GetMapping("/index")
    public String trytoPopulate(Model model){
        List<Entry> entriesList= entriesService.getAllEntries();
        model.addAttribute("entries", entriesList);
        return "createEntry";
    }

}

*/
