package com.entities

import com.interfaces.*

data class Model(
    override val id: String,
    override val name: String,
    val category: Category,
    val specification: Specification)
    : DictionaryBase