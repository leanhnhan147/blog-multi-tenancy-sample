package se.callista.blog.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TenantValue {

    @Size(max = 30)
    private String tenantId;

    @Size(max = 30)
    private String db;

    @Size(max = 30)
    private String password;
}
