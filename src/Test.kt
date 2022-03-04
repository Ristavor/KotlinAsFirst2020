import ru.spbstu.kotlin.typeclass.classes.Monoid.Companion.plus
/*
fun main() {
    fun myFun(text: String, teams: List<String>): Collection<Any> {
        val mapOfScore = mutableMapOf<String, Int>()
        val listOfGames = text.split("; ")
        for (game in listOfGames) {
            val teamScore = game.split(":")
            val firstTeam = teamScore[0].split(" ").first()
            val secondTeam = teamScore[1].split(" ").last()
            if (firstTeam !in mapOfScore) mapOfScore += firstTeam to 0
            if (secondTeam !in mapOfScore) mapOfScore += secondTeam to 0
            val firstTeamScore = teamScore[0].last().toString().toInt()
            val secondTeamScore = teamScore[1].first().toString().toInt()
            if (firstTeamScore == secondTeamScore) {
                mapOfScore[firstTeam] = mapOfScore[firstTeam]!! + 1
                mapOfScore[secondTeam].plus(1)
            }
            if (firstTeamScore > secondTeamScore) {
                mapOfScore[firstTeam].plus(3)
                mapOfScore[secondTeam].plus(0)
            }
            if (firstTeamScore < secondTeamScore) {
                mapOfScore[firstTeam].plus(0)
                mapOfScore[secondTeam].plus(3)
            }
        }
        val result = mutableMapOf<String, Int>()
        for (team in teams) {
            if (team !in mapOfScore) result += team to 0
        }
        return result
    }
}
 */