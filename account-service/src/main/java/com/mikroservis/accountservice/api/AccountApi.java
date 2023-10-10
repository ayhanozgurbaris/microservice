package com.mikroservis.accountservice.api;

import com.mikroservis.accountservice.entity.Account;
import com.mikroservis.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@RequestMapping("account")
/**
 * localhost:8080/account
 */
public class AccountApi {
    /*    @Autowired
    AccountService accountService;*/

    //  AccountService accountService = new AccountService();

    private final AccountService accountService;
    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id){
       return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<Account> update(Account account){
        return ResponseEntity.ok(accountService.update(account));
    }

    @DeleteMapping
    public void delete(String id){
        accountService.delete(id);
    }


}
