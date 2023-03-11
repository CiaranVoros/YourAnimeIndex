package com.vercel.Backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vercel.Backend.models.User;
import com.vercel.Backend.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/api")
public class UserAPI {

  @Autowired
  private UserRepository userRepo;

  @GetMapping("/users")
  public List<User> allUsers() {
    return userRepo.findAll();
  }
}