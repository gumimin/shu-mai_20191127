package com.example.demo.controller

import com.example.demo.entity.ItemEntity
import com.example.demo.repository.ItemRepository
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(private val itemRepository: ItemRepository) {
    @GetMapping("/items")
    fun getAll() = itemRepository.findAll().asFlow()

    @PostMapping("/items")
    suspend fun create(@RequestBody item: ItemEntity) = itemRepository.save(item).awaitFirst()
}