package com.tanln.invoice.userserivice.entity;

import com.tanln.invoice.baseservice.domain.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Status status;

    @CreatedDate
    private Date create_date;

    @LastModifiedDate
    private Date modified;

    @Column(name = "created_by")
    @CreatedBy
    private String author;

    @Column(name = "modified_by")
    @LastModifiedBy
    private String editor;

    private String name;

    @Column(unique = true)
    private String taxCode;

    private String phone;

    private String email;

    private String parent = null;

    private String description;

}
