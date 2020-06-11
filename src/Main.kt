/**
 * 1 rabbit saw 9 elephants while going to the river.
 * Every elephant saw 3 monkeys going to the river.
 * Each monkey had 1 tortoise in each hand.
 */

fun main(args: Array<String>) {
    // calculate all permutation.
    val answers = ArrayList<Animals>()
    for (i in 1 until 9) {
        answers.add(Animals(i))
    }

    answers.forEach {
        println(it)
    }
}

class Animals(monkeyRange: Int = 1) {
    val rabbits = 1
    val elephtants get() = rabbits * 9

    var monkeies = 3 * monkeyRange
    val tortoise get() = monkeies * 2

    override fun toString(): String {
        return """
            r : $rabbits, e : $elephtants, m : $monkeies,  t : $tortoise, Total : ${rabbits + elephtants + monkeies + tortoise}
        """.trimIndent()
    }
}