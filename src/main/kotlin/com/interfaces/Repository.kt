package com.interfaces

interface Repository<T>
{

    fun getAll() : List<T>

    fun getById (id : String) : T

    fun add (item : T) : String

    fun update (item : T) : Boolean

    fun remove (id: String) : Boolean

}