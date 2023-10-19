package com.account.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.account.controller.HealthcheckApi;

@RestController
<<<<<<< HEAD:app/src/main/java/practicetask/HealthCheckController.java
public class HealthCheckController implements DefaultApi {
  @Override
  public ResponseEntity<Void> apiV1HealthcheckGet() throws Exception {
    return ResponseEntity.ok().build();
  }
=======
public class HealthCheckController implements HealthcheckApi {
    @Override
    public ResponseEntity<Void> apiV1HealthcheckGet() throws Exception {
        return ResponseEntity.ok().build();
    }
>>>>>>> d84307e42a89085a03628df4d924a7558748e8a4:app/src/main/java/com/account/controller/impl/HealthCheckController.java
}
