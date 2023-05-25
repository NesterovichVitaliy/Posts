data class Post(
    var id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val date: Long,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val likes: Likes
)