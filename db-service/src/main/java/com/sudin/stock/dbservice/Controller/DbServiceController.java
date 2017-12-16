package com.sudin.stock.dbservice.Controller;

import com.sudin.stock.dbservice.Model.Quote;
import com.sudin.stock.dbservice.Model.Quotes;
import com.sudin.stock.dbservice.Repository.QuotesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/rest/db")
public class DbServiceController {

    private QuotesRepository quotesRepository;

    public DbServiceController(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username")
                                  final String username){

       return quotesRepository.findByUserName(username)
        .stream()
        .map(Quote::getQuote)
        .collect(Collectors.toList());
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Quotes quote){
        return null;
    }

}
