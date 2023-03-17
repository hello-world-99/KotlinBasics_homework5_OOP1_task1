import Post.*
import Post.Donut.Donut
import Post.Donut.Placeholder
import Post.Geo.Geo
import Post.Geo.Place

fun main() {
    var wall=WallService

    val newPost1:Post=Post(1,1,1,1,
        1672520400,"helloworld",1,
        1,false,Comment(0,true,true,true,true),
        Copyright(1,"www.vk.com", "aaa", "type1"), Like(100,true,true,true),
        Repost(10, false), View(1000), "1",
        PostSource(), emptyArray<String>(), Geo("type1", "100 100", Place()),
        1, emptyArray<Int>(), true,true,true,true,
        false, false,
        Donut(false, 0, Placeholder(), false, "duration"), 1)
    wall.add(newPost1)
}
