package mongo

import com.entities.*
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.bson.codecs.configuration.CodecRegistries
import org.bson.codecs.pojo.PojoCodecProvider

class MongoRepository<T : DictionaryBase>(
    private val collectionName : String,
    private val documentClass : Class<T> )
{

    private val mongoClient =  MongoClients.create()

    private val codecRegistry = CodecRegistries.fromRegistries(
        MongoClientSettings.getDefaultCodecRegistry(), CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()))

    private val mongoDB =  mongoClient.getDatabase("mydb").withCodecRegistry(codecRegistry)

    val collection = mongoDB?.getCollection(collectionName, documentClass)

}