package com.example.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("items")
data class ItemEntity(
    @Id
    @JsonIgnore
    val id: Int = 0,
    val name: String,
    val price: Int
)