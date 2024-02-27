package org.example.abc.controller;

import org.example.abc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/abc")
public class HelloController {
//dinh nghia request
    @GetMapping("/hello")
    public String index(){
        return "index";
    }

    @GetMapping("/customer")
    public String list(HttpServletRequest request){
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"Loc","Loc@gmail.com","HN"));
        list.add(new Customer(2,"Thang","Thang@gmail.com","HN"));
        list.add(new Customer(3,"Hai","Hai@gmail.com","HN"));
        list.add(new Customer(4,"Thong","Thong@gmail.com","HN"));
        list.add(new Customer(4,"TA","TA@gmail.com","HN"));
        request.setAttribute("ds",list);
        return "customers/list";
    }

    @GetMapping("/dskh")
    public String ds(Model model){
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"Loc","Loc@gmail.com","HN"));
        list.add(new Customer(2,"Thang","Thang@gmail.com","HN"));
        list.add(new Customer(3,"Hai","Hai@gmail.com","HN"));
        list.add(new Customer(4,"Thong","Thong@gmail.com","HN"));
        list.add(new Customer(4,"TA","TA@gmail.com","HN"));
        model.addAttribute("ds", list);
        return "customers/list";
    }


}
