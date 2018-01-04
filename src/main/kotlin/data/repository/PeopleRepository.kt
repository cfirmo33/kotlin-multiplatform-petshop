package data.repository

import data.datasource.DatabaseDataSource
import data.datasource.NetworkDataSource
import domain.model.Person
import domain.repository.Repository

/**
 * PeopleRepository
 */
class PeopleRepository(private val network: NetworkDataSource,
                       private val database: DatabaseDataSource) : Repository {

    override fun getPeople(refresh: Boolean): List<Person> =
            if (refresh) {
                val people = network.getPeople()
                database.savePeople(people)
                people
            } else {
                database.getPeople()
            }

}