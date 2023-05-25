import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest(){
        WallService.clear()
    }

    @Test
    fun updateExisting() {
        val service = WallService
        service.add(
            Post(
                1,
                17,
                17,
                1685019520,
                "Added",
                22,
                22,
                true,
                Comments(5, true, true, false, false),
                Likes(25, true, true, true)
            )
        )
        service.add(
            Post(
                2,
                7,
                7,
                1685029520,
                "Added",
                1,
                1,
                false,
                Comments(2, true, true, false, false),
                Likes(70, true, true, true)
            )
        )
        service.add(
            Post(
                3,
                2,
                2,
                1685039520,
                "Updated",
                44,
                44,
                false,
                Comments(20, true, true, false, false),
                Likes(200, true, true, true)
            )
        )
        val update = Post(
            1,
            11,
            11,
            1685049520,
            "Updated",
            33,
            33,
            true,
            Comments(10, true, true, false, false),
            Likes(7, true, true, true)
        )
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val service = WallService
        service.add(
            Post(
                1,
                17,
                17,
                1685019520,
                "Added",
                22,
                22,
                true,
                Comments(5, true, true, false, false),
                Likes(25, true, true, true)
            )
        )
        service.add(
            Post(
                2,
                7,
                7,
                1685029520,
                "Added",
                1,
                1,
                false,
                Comments(2, true, true, false, false),
                Likes(70, true, true, true)
            )
        )
        service.add(
            Post(
                3,
                2,
                2,
                1685039520,
                "Updated",
                44,
                44,
                false,
                Comments(20, true, true, false, false),
                Likes(200, true, true, true)
            )
        )
        val update = Post(
            11,
            11,
            11,
            1685049520,
            "Updated",
            33,
            33,
            true,
            Comments(10, true, true, false, false),
            Likes(7, true, true, true)
        )
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun add() {
        val service = WallService
        val postNew = service.add(Post(
            1,
            7,
            7,
            1685029520,
            "Added",
            1,
            1,
            false,
            Comments(2, true, true, false, false),
            Likes(70, true, true, true)))

        assertTrue(postNew.id > 0)
    }
}