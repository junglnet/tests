package mongo

import com.entities.DictionaryBase

class MongoRepositoriesBundle {

    val dictionaryBaseRepository =
        MongoRepository<DictionaryBase>("DictionaryBase", DictionaryBase::class.java)
}