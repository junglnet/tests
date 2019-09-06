
import com.entities.*
import mongo.*
import mongo.entityReposotories.*
import org.bson.types.ObjectId

object MongoBundle
    {

        val current = MongoRepositoriesBundle()
    }

    object Factory {

        val dictionaryBaseRepository = DictionaryBaseMongoRepository(MongoBundle.current)
    }


    fun main() {

        val entiti2 = DictionaryBase("test")

        try
        {
            println (Factory.dictionaryBaseRepository.add(entiti2) )
        }

        catch (e: Exception) {
            println(e.message)
        }



    }
