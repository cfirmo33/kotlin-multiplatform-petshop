package data.datasource

import domain.model.Person

/**
 * Datasources
 */
interface NetworkDataSource {
    fun getPeople(): List<Person>
}

interface DatabaseDataSource {
    fun getPeople(): List<Person>
    fun savePeople(people: List<Person>)
}