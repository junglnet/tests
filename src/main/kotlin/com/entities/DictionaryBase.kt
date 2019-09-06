package com.entities

import org.bson.types.ObjectId

data class DictionaryBase (val name : String?, val id : String? = ObjectId.get().toString())