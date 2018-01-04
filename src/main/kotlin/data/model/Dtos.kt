package data.model

/**
 * Dtos
 */

data class PeopleResponseDto(
		val count: Int, //87
		val next: String, //https://swapi.co/api/people/?page=2
		val previous: Any, //null
		val results: List<PersonDto>
)

data class PersonDto(
		val name: String, //Luke Skywalker
		val height: String, //172
		val mass: String, //77
		val hair_color: String, //blond
		val skin_color: String, //fair
		val eye_color: String, //blue
		val birth_year: String, //19BBY
		val gender: String, //male
		val homeworld: String, //https://swapi.co/api/planets/1/
		val films: List<String>,
		val species: List<String>,
		val vehicles: List<String>,
		val starships: List<String>,
		val created: String, //2014-12-09T13:50:51.644000Z
		val edited: String, //2014-12-20T21:17:56.891000Z
		val url: String //https://swapi.co/api/people/1/
)