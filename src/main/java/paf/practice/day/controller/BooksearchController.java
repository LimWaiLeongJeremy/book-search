package paf.practice.day.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import paf.practice.day.model.Search;
import paf.practice.day.service.SearchService;

@Controller
@RequestMapping (path = "/result")
public class BooksearchController {

    @Autowired
    private SearchService srv;

    @GetMapping
    public String search(@RequestParam String bookname, @RequestParam int limit, Model model) {

        List<Search> results = srv.getbooks(bookname, limit);
   

        // System.out.println("results: " + results);
        model.addAttribute("bookname", bookname);
        model.addAttribute("limit", limit);
        model.addAttribute("results", results);

        return "result";
    }
    
}
