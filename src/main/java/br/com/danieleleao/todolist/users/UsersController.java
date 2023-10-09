package br.com.danieleleao.todolist.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {


@PostMapping("/")    
    public void criar(@RequestBody UserModel novoUser){
        System.out.println(novoUser.nome);
    }
}
