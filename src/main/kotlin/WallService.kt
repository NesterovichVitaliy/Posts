object WallService {
    var posts: Array<Post> = emptyArray()
    private var lastId = 0

    fun add(post: Post): Post {
        val postNew = post.copy(id = ++lastId)
        posts += postNew
        return posts.last()
    }

    fun update(postFind: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postFind.id) {
                posts[index] = postFind.copy()
                return true
            }
        }
        return false
    }

    fun print() {
        for (post in posts) {
            println(post)
        }
        println("---------")
    }

    fun clear() {
        posts = emptyArray()
        lastId = 0
    }
}