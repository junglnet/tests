
import com.entities.*
import mongo.*
import mongo.entityReposotories.*

object MongoBundle
    {

        val current = MongoRepositoriesBundle()
    }

    object Factory {

        val categoryRepository = CategoryMongoRepository(MongoBundle.current)
    }


    fun main() {

        val entity2 = Category("test", "test")

        try
        {
            println (Factory.categoryRepository.add(entity2) )
        }

        catch (e: Exception) {
            println(e.message)
        }



    }
