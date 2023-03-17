package Post

import Post.*
import Post.Donut.Donut
import Post.Geo.Geo

class Post(id:Int, owner_id:Int, from_id:Int, created_by:Int,
           date:Int, text:String, reply_owner_id:Int, reply_post_id:Int, friends_only:Boolean,
           comments: Comment, copyright:Copyright, likes: Like, reposts: Repost, views: View,
           post_type:String, post_source: PostSource, attachments:Array<String>, geo:Geo,
           signer_id:Int, copy_history:Array<Int>, can_pin:Boolean, can_delete:Boolean, can_edit:Boolean,
           is_pinned:Boolean, marked_as_ads:Boolean, is_favorite:Boolean, donut:Donut, postponed_id:Int) {


}
