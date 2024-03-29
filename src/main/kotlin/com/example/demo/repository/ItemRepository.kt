package com.example.demo.repository

import com.example.demo.entity.ItemEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : ReactiveCrudRepository<ItemEntity, Int>