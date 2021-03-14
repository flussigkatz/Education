package Module17

class Peasant(val occupation: Occupation) {
    enum class Occupation(val profession: String) {
        WORKER("Worker"),
        BILDER("Bilder"),
        FARMER("Farmer")
    }

    override fun toString(): String {
        return "Peasant $occupation"
    }
}