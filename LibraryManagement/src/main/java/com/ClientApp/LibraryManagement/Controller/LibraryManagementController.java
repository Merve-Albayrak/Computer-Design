package com.ClientApp.LibraryManagement.Controller;

import com.ClientApp.LibraryManagement.Model.JsonLendBook;
import com.ClientApp.LibraryManagement.Model.LendViewModel;
import com.ClientApp.LibraryManagement.Model.LoginModel;
import com.ClientApp.LibraryManagement.Model.SaveUser;
import org.apache.coyote.Response;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Controller
@RequestMapping("/")
public class LibraryManagementController {



    @GetMapping("login")
    public  String login(Model model){
        model.addAttribute("login", new LoginModel());

        return  "login";
    }
    @PostMapping ("login")

  public   String login(@ModelAttribute LoginModel loginModel, Model model){

        String uri ="http://localhost:8081/users/login";
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<String> response=restTemplate.postForEntity(uri,loginModel,String.class);




model.addAttribute("login",loginModel);

if(response.getStatusCode()== HttpStatusCode.valueOf(200))
    return "main";




return "login";

    }


    @GetMapping("main")
    public  String main(){


        return  "main";
    }
    @GetMapping("lend")
    public  String lend(Model model){
        model.addAttribute("lend", new LendViewModel());

        return  "lend";
    }

    @PostMapping("lend")
    public  String lend(@ModelAttribute LendViewModel lendViewModel,Model model){


        String uri ="http://localhost:8082/books/getIdByBarcodeNumber/"+lendViewModel.getBarcodeNumber();
        RestTemplate restTemplate=new RestTemplate();
        String response=restTemplate.getForObject(uri,String.class);

        String uri1 ="http://localhost:8084/borrowers/getIdByTc/"+lendViewModel.getTcNumber();
        RestTemplate restTemplate1=new RestTemplate();
        String response1=restTemplate.getForObject(uri1,String.class);


        JsonLendBook jsonLendBook=new JsonLendBook();

        jsonLendBook.bookId.id=Integer.parseInt(response);
        jsonLendBook.borrowerId.id=Integer.parseInt(response1);
        jsonLendBook.deliveryDate=java.time.LocalDate.now().toString();
model.addAttribute("lend",lendViewModel);

        String uriPost ="http://localhost:8085/borrowrecords/save";
        RestTemplate restTemplatepost=new RestTemplate();
        ResponseEntity<String> responsePost=restTemplatepost.postForEntity(uriPost,jsonLendBook,String.class);
        if(responsePost.getStatusCode()== HttpStatusCode.valueOf(200)){


            return  "lend";
        }

       return "main";
    }
}
