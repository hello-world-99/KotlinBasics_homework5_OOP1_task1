package Post

import Post.*
import Post.Donut.Donut
import Post.Donut.Placeholder
import Post.Geo.Geo
import Post.Geo.Place

data class Post(
    val id:Int=0,
    val owner_id:Int,
    val from_id:Int,
    val created_by:Int,
    val date:Int,
    val text:String,
    val reply_owner_id:Int,
    val reply_post_id:Int,
    val friends_only:Boolean,
    val comments: Comment,
    val copyright:Copyright,
    val likes: Like,
    val reposts: Repost,
    val views: View,
    val post_type:String,
    val post_source: PostSource,
    val attachments:Array<String>,
    val geo:Geo,
    val signer_id:Int,
    val copy_history:Array<Int>,
    val can_pin:Boolean,
    val can_delete:Boolean,
    val can_edit:Boolean,
    val is_pinned:Boolean,
    val marked_as_ads:Boolean,
    val is_favorite:Boolean,
    val donut:Donut,
    val postponed_id:Int) {

}
