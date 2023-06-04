package com.addistech.springbootmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public class Customer {

    private final Long id;

    @NotBlank
    @NotBlank(message = "Name must not be empty")
    private final String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank(message = "Password must not be empty")
    private final String password;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email must not be empty and it must be valid")
    private final String email;

    public Customer(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @JsonProperty("Customer_id")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
