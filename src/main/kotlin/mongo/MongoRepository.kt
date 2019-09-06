package mongo

import com.DictionartBase
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection

class MongoRepository<T : DictionartBase>(var collectionName : String) {

    val mongoCollection : MongoCollection<T>

    init {
        val _mongoClient =  MongoClients.create()
        val _mongoDB =  _mongoClient.getDatabase("mydb")
        mongoCollection = _mongoDB.getCollection(collectionName)
    }
}