import org.junit.jupiter.api.Test
import prototype.ImageItem
import prototype.TextItem
import kotlin.test.assertEquals

class PrototypeTest {

    @Test
    fun `text item is cloneable`() {
        val textItem = TextItem()
        textItem.initializeText("Hello", "Red")
        val clonedTextItem = textItem.clone()
        assertEquals(clonedTextItem.text, textItem.text)
        assertEquals(clonedTextItem.color, textItem.color)
    }

    @Test
    fun `image item is cloneable`() {
        val imageItem = ImageItem()
        imageItem.url = "https://www.google.com"
        imageItem.width = 100
        val clonedImageItem = imageItem.clone()
        assertEquals(clonedImageItem.url, imageItem.url)
        assertEquals(clonedImageItem.width, imageItem.width)
    }
}