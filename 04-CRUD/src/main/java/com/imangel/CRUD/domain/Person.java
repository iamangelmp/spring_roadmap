package com.imangel.CRUD.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Alexis
 */
@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    protected Long user_id;

    @NotEmpty
    @Column(name = "user_name")
    protected String user_name;

    @Column(name = "user_last_name")
    @NotEmpty
    protected String user_last_name;

    @Column(name = "user_email")
    @NotEmpty
    protected String user_email;

    @Column(name = "user_phone")
    protected String user_phone;

}
