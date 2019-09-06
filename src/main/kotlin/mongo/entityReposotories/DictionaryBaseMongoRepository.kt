package mongo.entityReposotories

import com.entities.*
import com.interfaces.*
import mongo.*
import org.bson.types.ObjectId

class DictionaryBaseMongoRepository (
    private val bundle: MongoRepositoriesBundle)
    : Repository<DictionaryBase>
{

    override fun getAll(): List<DictionaryBase> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: String): DictionaryBase {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(item: DictionaryBase): String {

        //item.id = ObjectId.get().toString()
        bundle.dictionaryBaseRepository.collection?.insertOne(item)

        return item.id!!

    }

    override fun update(item: DictionaryBase): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(id: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}