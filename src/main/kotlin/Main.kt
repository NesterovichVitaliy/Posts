fun main() {

    val post1 = Post(
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

    val post2 = Post(
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

    val post3 = Post(
        1,
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

    val post4 = Post(
        2,
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

    WallService.add(post1)
    WallService.add(post2)

    WallService.print()

    if (WallService.update(post3)) WallService.print()
    if (WallService.update(post4)) WallService.print()
}
