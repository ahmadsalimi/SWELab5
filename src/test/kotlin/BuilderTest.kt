import builder.FoodOrder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderTest {

    @Test
    fun `builder works`() {
        val foodOrder = FoodOrder.Builder()
            .bread("wheat")
            .condiments("butter")
            .meat("beef")
            .fish("salmon")
            .build()

        assertEquals("wheat", foodOrder.bread)
        assertEquals("butter", foodOrder.condiments)
        assertEquals("beef", foodOrder.meat)
        assertEquals("salmon", foodOrder.fish)
    }
}