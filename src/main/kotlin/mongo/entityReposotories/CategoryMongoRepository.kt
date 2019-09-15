package mongo.entityReposotories

import com.entities.*
import com.interfaces.*
import com.mongodb.client.model.Filters.*
import mongo.*
import org.bson.conversions.Bson

class CategoryMongoRepository (
    private val bundle: MongoRepositoriesBundle)
    : Repository<Category>
{
    // TODO: Проверить возврат при пустом значении

    override fun getAll(): List<Category> =
        bundle.categoryMongoRepository.collection.find().toList()

    override fun getById(id: String): Category? =
        bundle.categoryMongoRepository.collection.find(eq("_id", id)).first()

    override fun add(item: Category) =
        bundle.categoryMongoRepository.collection.insertOne(item)

    override fun update(item: Category): Boolean =
         bundle.categoryMongoRepository.collection.replaceOne(eq("_id", item.id), item).wasAcknowledged()

    override fun remove(id: String): Boolean =
        bundle.categoryMongoRepository.collection.deleteOne(eq("_id", id)).wasAcknowledged()
}