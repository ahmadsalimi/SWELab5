import abstractfactory.Crossbow
import abstractfactory.Katana
import org.junit.jupiter.api.Test

class WeaponTest {

    @Test
    fun `crossbow's type is right`() {
        val factory = Crossbow.Factory
        val crossbow = factory.buildWeapon()
        assert(crossbow is Crossbow)
    }

    @Test
    fun `crossbow is usable`() {
        val factory = Crossbow.Factory
        val crossbow = factory.buildWeapon()
        assert(crossbow.use() == "Using crossbow weapon")
    }

    @Test
    fun `katana's type is right`() {
        val factory = Katana.Factory
        val katana = factory.buildWeapon()
        assert(katana is Katana)
    }

    @Test
    fun `katana is usable`() {
        val factory = Katana.Factory
        val katana = factory.buildWeapon()
        assert(katana.use() == "Using katana weapon")
    }
}