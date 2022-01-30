package com.antunesrd.hrpayroll.resources;

import com.antunesrd.hrpayroll.entities.Payment;
import com.antunesrd.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{workerId}/days/{days}")
    @ResponseStatus(HttpStatus.OK)
    public Payment getPayment(@PathVariable Long workerId, @PathVariable Integer days){
        return paymentService.getPayment(workerId, days);
    }
}
