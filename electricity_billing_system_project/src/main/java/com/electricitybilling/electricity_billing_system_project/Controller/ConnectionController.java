package com.electricitybilling.electricity_billing_system_project.Controller;

import com.electricitybilling.electricity_billing_system_project.Payload.ConnectionDto;
import com.electricitybilling.electricity_billing_system_project.Service.ConnectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/connection")
@RequiredArgsConstructor
public class ConnectionController {

    private final ConnectionService connectionService;

    @PostMapping("/{customerId}")
    public ResponseEntity<?> applyConnection(@RequestBody ConnectionDto connectionDto, @PathVariable Long customerId){
        return ResponseEntity.ok(connectionService.applyConnection(connectionDto, customerId));
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<?> getConnection(@RequestParam(value = "connectionid", required = true) Integer connectionId){
        return ResponseEntity.ok(connectionService.getConnection(connectionId));
    }
}
