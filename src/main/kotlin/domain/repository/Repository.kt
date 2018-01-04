package domain.repository

import domain.model.Person

/**
 * Repository
 */
interface Repository {
    fun getPeople(refresh: Boolean): List<Person>
}