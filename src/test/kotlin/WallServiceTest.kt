import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {


    @Test
    fun add1() {
        var wall= WallService
        val newPost=WallService.original.copy()

        assertEquals(wall.add(newPost).id!=0,true)
    }

    @Test
    fun update1() {
        var wall= WallService
        val newPost=WallService.original.copy()
        wall.add(newPost)

        assertEquals(wall.update(newPost.copy(id=1)),true)
    }
    @Test
    fun update2() {
        var wall= WallService
        val newPost=WallService.original.copy()
        wall.add(newPost)

        assertEquals(wall.update(newPost.copy(id=7)),false)
    }
}