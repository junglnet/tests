package com.entities

import com.interfaces.*

data class Category(
    override val id: String,
    override val name: String) : DictionaryBase