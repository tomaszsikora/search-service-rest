package com.ugotujdlamnie.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by t.sikora on 2018-05-04.
 */
@RestController
public class SearchRestController
{
  @PostMapping("/_search")
  ResponseEntity<?> normalize(@RequestBody SearchEntity entity)
  {
    return ResponseEntity.ok(null);
  }
}
