package se.callista.blog.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import se.callista.blog.management.model.TenantValue;
import se.callista.blog.management.service.TenantManagementService;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class TenantsApiController {

    @Autowired
    private TenantManagementService tenantManagementService;

    @PostMapping("/tenants")
    public ResponseEntity<Void> createTenant(@Valid @RequestBody TenantValue tenantValue) {
        tenantManagementService.createTenant(tenantValue.getTenantId(), tenantValue.getDb(), tenantValue.getPassword());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
