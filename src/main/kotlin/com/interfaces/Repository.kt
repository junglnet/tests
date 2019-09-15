package com.interfaces

interface Repository<T>
{

    fun getAll() : List<T>

    fun getById (id : String) : T?

    fun add (item : T)

    fun update (item : T) : Boolean

    fun remove (id: String) : Boolean

}