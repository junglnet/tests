package mongo

import com.entities.*
import com.interfaces.*

class MongoRepositoriesBundle {

    val categoryMongoRepository =
        MongoRepository<Category>("Category", Category::class.java)
}