package org.hshinde.data_migration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@GetMapping("/")
public String health() {
  return "Hello & Welcome to Data Migration application !!!";
}
}
