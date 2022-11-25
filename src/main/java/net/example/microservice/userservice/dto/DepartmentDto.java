package net.example.microservice.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DepartmentDto {

    private Long id;

    private String departmentName;

    private String departmentAddress;

    private String departmentCode;
}
