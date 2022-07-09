package com.prudence.tweetapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.prudence.tweetapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }
    fun displayTweet(){
        var tweet=Tweet("Ahimbisibwe Prudence","@prudea"," I love God.He is the holder of my life. #christianity","61","54","16 ","80")
        var tweet1=Tweet("Abisinguza dallen","@dallen"," I love food #eat","6","6","9","10")
        var tweet2=Tweet("Niwenyesiga speria","@speria"," Life have no balance #confidence","7","60","9","10")
        var tweet3=Tweet("Ashly Ochanda","@ashly"," Learn to learn #learn","2","45","8","12")
        var tweet4=Tweet("Annena Beatrice","@annena"," Never regret #appriciatelife","12","7","6","45")
        var tweetList= listOf(tweet,tweet1,tweet2,tweet3,tweet4)

        var Adapter=TweetAdapter(tweetList)
        binding.rvtweet.layoutManager= LinearLayoutManager(this)
        binding.rvtweet.adapter=Adapter
    }
}