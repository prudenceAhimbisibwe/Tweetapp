package com.prudence.tweetapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetAdapter  (var tweetList:List<Tweet>): RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return  TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currntContact=tweetList.get(position)
        holder.tvName.text=currntContact.name
        holder.tvUsername.text=currntContact.username
        holder.tvtweet.text=currntContact.tweet
        holder.tvnum1.text=currntContact.num1
        holder.tvnum2.text=currntContact.num2
        holder.tvnum4.text=currntContact.num4
        holder.tvlike.text=currntContact.like
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TweetViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvUsername=itemView.findViewById<TextView>(R.id.tvUsername)
    var tvtweet=itemView.findViewById<TextView>(R.id.tvtweet)
    var tvnum1=itemView.findViewById<TextView>(R.id.tvnum1)
    var tvnum2=itemView.findViewById<TextView>(R.id.tvnum2)
    var tvlike=itemView.findViewById<TextView>(R.id.tvlike)
    var tvnum4=itemView.findViewById<TextView>(R.id.tvnum4)

     }
